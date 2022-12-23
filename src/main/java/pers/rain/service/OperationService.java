package pers.rain.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pers.rain.dao.OperationDAO;
import pers.rain.pojo.*;
import pers.rain.util.IPUtils;

import java.util.Date;

// 使用注解声明当前类是业务层的类
@Service
public class OperationService {

    @Autowired(required = false)
    OperationDAO dao;

    /**
     * 保存一条用户操作记录 和 操作的详情记录
     * @param optDO  用户操作记录
     * @param baseDO 操作的详情记录，BaseDO是父类
     */
    @Transactional    //注解用于声明当前方法中所有代码，在一个事务中执行！要么都成功，要么都失败/什么都不做
    public void saveOperation(OperationDO optDO, OptBaseDO baseDO) {
        // 调用工具的方法，获取用户的IP地址
        String userIP = IPUtils.getIpAddr();
        // 将IP地址，保存到optDO中
        optDO.setUserIp(userIP);
        
        optDO.setCreatedTime(new Date());
        // 调用持久层方法，添加操作记录
        int row1 = dao.insertOperation(optDO);
        // 判断添加是否失败
        if(row1<1){
            // 是失败了：抛出异常，事务回滚，方法终止
            // Todo 自定义异常
            throw new RuntimeException("用户操作数据添加失败");
        }

        // 获取数据库中为操作记录生成的id
        Integer optId = optDO.getId();
        // 将生成的id值，保存到baseDO中
        baseDO.setOptId(optId);

        // 根据操作类型，将baseDO转换成OptClickDO，OptZoomDO，OptDragDO
        int row2 = 0;
        switch (optDO.getOptType()) {
            case OperationDO.OPT_TYPE_CLICK:
                // 调用操作类型对应的持久层方法，添加操作详情记录
                row2 = dao.insertOptClick((OptClickDO)baseDO);
                break;
            case OperationDO.OPT_TYPE_ZOOM:
                row2 = dao.insertOptZoom((OptZoomDO) baseDO);
                break;
            case OperationDO.OPT_TYPE_DRAG:
                row2 = dao.insertOptDrag((OptDragDO) baseDO);
                break;
        }
        // 判断添加是否失败
        if(row2 < 1) {
            // 是失败：抛出异常，触发事务回滚
            throw new RuntimeException("用户操作详情 添加失败");
        }
    }

}

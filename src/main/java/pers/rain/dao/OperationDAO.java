package pers.rain.dao;

import org.apache.ibatis.annotations.Mapper;
import pers.rain.pojo.OperationDO;
import pers.rain.pojo.OptClickDO;
import pers.rain.pojo.OptDragDO;
import pers.rain.pojo.OptZoomDO;

import java.util.HashMap;
import java.util.List;

/**
 * 用户行为数据 的 持久层接口
 */
@Mapper
public interface OperationDAO {

    /**
     * 保存一条用户行为记录
     * @param optDO
     * @return
     */
    int insertOperation(OperationDO optDO);

    /**
     * 保存一条点击详情记录
     * @param clickDO
     * @return
     */
    int insertOptClick(OptClickDO clickDO);
    
    /**
     * 保存一条缩放记录
     * @param zoomDO
     * @return
     */
    int insertOptZoom(OptZoomDO zoomDO);
    
    /**
     * 保存一条拖拽记录
     * @param dragDO
     * @return
     */
    int insertOptDrag(OptDragDO dragDO);
    
    List<HashMap<Integer,Integer>> getUserOpt();

}

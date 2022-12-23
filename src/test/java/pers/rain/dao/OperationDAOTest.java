package pers.rain.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pers.rain.pojo.OperationDO;
import pers.rain.pojo.OptClickDO;

import java.util.HashMap;
import java.util.List;

@SpringBootTest
public class OperationDAOTest {

    // 由框架帮着，实现该接口中的方法，生成一个具体的实现类
    // @Autowried注解的意思是，将实现类对象的引用传入过来
    @Autowired(required=false)
    OperationDAO dao;

    @Test
    void insertOperation() {
        System.out.println(dao);
        // org.apache.ibatis.binding.MapperProxy@75120e58

        OperationDO optDO =
                new OperationDO(null,0,"127.0.0.1",null);

        System.out.println("插入之前的id：" + optDO.getId());
        int row = dao.insertOperation(optDO);
            // 使用dao代码插入记录
            //  会返回受影响的记录行数
            //  同时将数据库生成的id值，设置到optDO对象中
        System.out.println("插入之后的id：" + optDO.getId());

        System.out.println("row: " + row);
    }

    @Test
    public void insertOptClick() {
        OptClickDO clickDO = new OptClickDO(1,"7789","Test Station");
        int row = dao.insertOptClick(clickDO);
        System.out.println("row: " + row);
    }
    
    @Test
    public void test(){
        List<HashMap<Integer, Integer>> list = dao.getUserOpt();
        list.forEach(System.out::println);
    }
}

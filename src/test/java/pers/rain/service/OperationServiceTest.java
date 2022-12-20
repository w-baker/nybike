package pers.rain.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pers.rain.pojo.OperationDO;
import pers.rain.pojo.OptClickDO;

@SpringBootTest
public class OperationServiceTest {

    @Autowired(required = false)
    OperationService service;

    @Test
    void saveOperation() {
        OperationDO optDO = new OperationDO(null,0,"192.0.0.1",null);
        OptClickDO clickDO = new OptClickDO(null,"321","TestStation");
        service.saveOperation(optDO, clickDO);
    }
}

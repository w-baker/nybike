package pers.rain.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.rain.pojo.*;
import pers.rain.service.OperationService;
import pers.rain.util.JsonResult;

@RestController
@RequestMapping("/opt")     // 声明匹配的请求路径
public class OperationController {
    
    @Autowired
    OperationService service;
    
    @RequestMapping("/save")
    public JsonResult<Void> saveOperation(SaveOptParam param) {
//        System.out.println("后台接收到的参数：" + param);
        
        OperationDO optDO = new OperationDO();
        optDO.setOptType(param.getOptType());
        
        OptBaseDO baseDO = null;
        switch (optDO.getOptType()) {
            case OperationDO.OPT_TYPE_CLICK:
                baseDO = new OptClickDO(
                        null, param.getStationId(), param.getStationName()
                );
                break;
            case OperationDO.OPT_TYPE_ZOOM:
                baseDO = new OptZoomDO(null,
                        param.getZoomStartLevel(), param.getZoomEndLevel());
                break;
            case OperationDO.OPT_TYPE_DRAG:
                baseDO = new OptDragDO(null,
                        param.getDragStartLat(), param.getDragStartLon(),
                        param.getDragEndLat(),param.getDragEndLon());
                break;
        }
        
//          调用业务层方法，保存操作记录
        service.saveOperation(optDO, baseDO);
        
        return JsonResult.getSuccessJR();
    }
}

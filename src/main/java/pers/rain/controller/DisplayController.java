package pers.rain.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pers.rain.service.DisplayService;
import pers.rain.util.JsonResult;

import java.util.Map;

/**
 * 数据大屏控制器
 * @Auther: W-CH
 * @Time: 2022-12-24 14:34
 * @E-mail: wang.xiaohong.0817@gmail.com
 * @Software: IntelliJ IDEA
 */
@RestController
@RequestMapping("/display")
public class DisplayController {
    @Autowired
    DisplayService service;
    
    @RequestMapping("/getStartStationTop5")
    public JsonResult<Map> getStartStationTop5(){
        Map<String, Integer> map = service.getStartStationTop5();
        // 数据请求成功则将数据封装返回
        return JsonResult.getSuccessJR(map);
    }
    
    @RequestMapping("/getEndStationTop5")
    public JsonResult<Map> getEndStationTop5(){
        Map<String, Integer> map = service.getEndStationTop5();
        // 封装数据并返回
        return JsonResult.getSuccessJR(map);
    }
    
    @RequestMapping("/getUserOpt")
    public JsonResult<Map> getUserOpt(){
        Map<String, Integer> map = service.getUserOpt();
        // 封装数据并返回
        return JsonResult.getSuccessJR(map);
    }
    
    @RequestMapping("/getRideableTypeAndCount")
    public JsonResult<Map> getRideableTypeAndCount(){
        Map<String, Integer> map = service.getRideableTypeAndCount();
        // 封装数据并返回
        return JsonResult.getSuccessJR(map);
    }
    
}

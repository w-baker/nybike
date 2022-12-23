package pers.rain.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pers.rain.dao.DisplayDao;
import pers.rain.dao.OperationDAO;
import pers.rain.pojo.OperationDO;
import pers.rain.service.DisplayService;
import pers.rain.util.MapUtils;

import java.util.*;

/**
 * 数据大屏服务层
 * @Auther: W-CH
 * @Time: 2022-12-24 15:27
 * @E-mail: wang.xiaohong.0817@gmail.com
 * @Software: IntelliJ IDEA
 */
@Service
public class DisplayServiceImpl implements DisplayService {
    @Autowired
    DisplayDao displayDao;
    @Autowired
    OperationDAO operationDAO;
    
    @Override
    public Map<String, Integer> getStartStationTop5() {
        List<HashMap<String, Integer>> list = displayDao.getStartStationTop5();
        
        Map<String, Integer> map = new LinkedHashMap<>();

        if (list != null && !list.isEmpty()) {
            for (HashMap<String, Integer> hashMap : list) {

                String key = String.valueOf(hashMap.get("stationId"));
                Integer value =Integer.parseInt(String.valueOf(hashMap.get("count")));

                map.put(key, value);
            }
        }
        return map;
    }
    
    @Override
    public Map<String, Integer> getEndStationTop5() {
        List<HashMap<String, Integer>> list = displayDao.getEndStationTop5();
        
        HashMap<String, Integer> map = new LinkedHashMap<>();
    
        if (list != null && !list.isEmpty()) {
            for (HashMap<String, Integer> hashMap : list) {
                String key = String.valueOf(hashMap.get("stationId"));
                Integer value =Integer.parseInt(String.valueOf(hashMap.get("count")));
            
                map.put(key, value);
            }
        }
        return map;
    }
    
    @Override
    public Map<String, Integer> getUserOpt() {
        List<HashMap<Integer, Integer>> list = operationDAO.getUserOpt();
    
        HashMap<String, Integer> map = new LinkedHashMap<>();
        
        String key= null;
        Integer value = null;
    
        if (list != null && !list.isEmpty()) {
            for (HashMap<Integer, Integer> hashMap : list) {
                switch (hashMap.get("optType")){
                    case OperationDO.OPT_TYPE_CLICK:
                        key = "点击";
                        break;
                    case OperationDO.OPT_TYPE_ZOOM:
                        key = "缩放";
                        break;
                    case OperationDO.OPT_TYPE_DRAG:
                        key = "拖拽";
                        break;
                }
                
                value = Integer.parseInt(String.valueOf(hashMap.get("count")));
                
                map.put(key, value);
            }
        }
        return map;
    }
    
    @Override
    public Map<String, Integer> getRideableTypeAndCount() {
        List<HashMap<String, Integer>> list = displayDao.getRideableTypeAndCount();
        HashMap<String, Integer> map = new LinkedHashMap<>();
    
        if (list != null && !list.isEmpty()) {
            for (HashMap<String, Integer> hashMap : list) {
            
                String key = String.valueOf(hashMap.get("rideableType"));
                switch (key){
                    case "classic_bike":
                        key = "经典";
                        break;
                    case "electric_bike":
                        key = "电车";
                        break;
                    case "docked_bike":
                        key = "停靠";
                        break;
                }
                
                Integer value =Integer.parseInt(String.valueOf(hashMap.get("count")));
            
                map.put(key, value);
            }
        }
        return map;
    }
}

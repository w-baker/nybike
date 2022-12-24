package pers.rain.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Auther: W-CH
 * @Time: 2022-12-24 14:44
 * @E-mail: wang.xiaohong.0817@gmail.com
 * @Software: IntelliJ IDEA
 */
public interface DisplayService {
    /**
     * 获取起始站点的前5个
     * @return
     */
    public Map<String,Integer> getStartStationTop5();
    
    /**
     * 获取结束站点的前五个
     * @return
     */
    public Map<String,Integer> getEndStationTop5();
    
    /**
     * 获取用户点击行为数量
     * @return
     */
    public Map<String,Integer> getUserOpt();
    
    /**
     * 获取车辆类型
     * @return
     */
    public Map<String,Integer> getRideableTypeAndCount();
}

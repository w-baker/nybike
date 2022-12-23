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
    public Map<String,Integer> getStartStationTop5();
    public Map<String,Integer> getEndStationTop5();
    public Map<String,Integer> getUserOpt();
    public Map<String,Integer> getRideableTypeAndCount();
}

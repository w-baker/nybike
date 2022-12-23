package pers.rain.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Auther: W-CH
 * @Time: 2022-12-24 15:41
 * @E-mail: wang.xiaohong.0817@gmail.com
 * @Software: IntelliJ IDEA
 */
@SpringBootTest
class DisplayServiceTest {
    @Autowired
    DisplayService displayService;
    
    @Test
    void getStartStationTop5() {
        Map<String, Integer> map = displayService.getStartStationTop5();
    
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry);
        }
        
    }
    
    @Test
    void getEndStationTop5() {
        Map<String, Integer> map = displayService.getEndStationTop5();
    
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry);
        }
    
    }
    
    @Test
    void getUserOpt() {
        Map<String, Integer> map = displayService.getUserOpt();
    
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry);
        }
    
    }
    
    @Test
    void getRideableTypeAndCount() {
        Map<String, Integer> map = displayService.getRideableTypeAndCount();
    
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry);
        }
    
    }
}
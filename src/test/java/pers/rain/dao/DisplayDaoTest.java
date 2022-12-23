package pers.rain.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @Auther: W-CH
 * @Time: 2022-12-24 15:02
 * @E-mail: wang.xiaohong.0817@gmail.com
 * @Software: IntelliJ IDEA
 */
@SpringBootTest
class DisplayDaoTest {
    @Autowired
    DisplayDao displayDao;
    @Test
    void getStartStationTop5() {
        List<HashMap<String, Integer>> list = displayDao.getStartStationTop5();
        list.forEach(System.out::println);
    }
    
    @Test
    void getEndStationTop5() {
        List<HashMap<String, Integer>> list = displayDao.getEndStationTop5();
        list.forEach(System.out::println);
    }
    
    @Test
    void getRideableTypeAndCount() {
        List<HashMap<String, Integer>> list = displayDao.getRideableTypeAndCount();
        list.forEach(System.out::println);
    }
}
package pers.rain.dao;

import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

/**
 * @Auther: W-CH
 * @Time: 2022-12-24 14:47
 * @E-mail: wang.xiaohong.0817@gmail.com
 * @Software: IntelliJ IDEA
 */
@Mapper
public interface DisplayDao {
    /**
     * 查询起始站中的前5名
     * @return
     */
    List<HashMap<String,Integer>> getStartStationTop5();
    
    /**
     * 查询起到达站中的前5名
     * @return
     */
    List<HashMap<String,Integer>> getEndStationTop5();
    
    /**
     * 查询不同车辆的骑行次数
     * @return
     */
    List<HashMap<String,Integer>> getRideableTypeAndCount();
}

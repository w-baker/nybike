package pers.rain.util;

import java.util.*;

/**
 * 对map按值排序
 * @Auther: W-CH
 * @Time: 2022-12-24 16:18
 * @E-mail: wang.xiaohong.0817@gmail.com
 * @Software: IntelliJ IDEA
 */
public class MapUtils {
    
    public static ArrayList<Map.Entry<String, Integer>> mapSortByValue(TreeMap<String,Integer> map){
        //自定义比较器
        Comparator<Map.Entry<String, Integer>> valCmp = new Comparator<Map.Entry<String,Integer>>() {
    
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue()-o1.getValue();  // 降序排序，如果想升序就反过来
            }
        };
        //将map转成List，map的一组key，value对应list一个存储空间
        ArrayList<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());//传入maps实体
        Collections.sort(list,valCmp); // 注意此处Collections 是java.util包下面的,传入List和自定义的valCmp比较器
        return list;
    }
}

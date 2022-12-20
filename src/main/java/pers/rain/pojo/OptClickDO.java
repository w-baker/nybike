package pers.rain.pojo;


/**
 * 点击事件对应的类
 *@Time     :2022/12/23 09:32
 *@Auther   :CH-Wang
 *@E-mail   :wang.xiaohong.0817@gamil.com
 *@File     :OptClickDO.java
 *@Software :IntelliJ IDEA
 */
public class OptClickDO extends OptBaseDO{
    private String stationId;
    private String stationName;

    public OptClickDO() {
    }

    public OptClickDO(String stationId, String stationName) {
        this.stationId = stationId;
        this.stationName = stationName;
    }

    public OptClickDO(Integer optId, String stationId, String stationName) {
        super(optId);
        this.stationId = stationId;
        this.stationName = stationName;
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    @Override
    public String toString() {
        return "OptClickDO{" +
                "stationId='" + stationId + '\'' +
                ", stationName='" + stationName + '\'' +
                '}';
    }
}

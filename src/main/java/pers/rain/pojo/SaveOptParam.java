package pers.rain.pojo;

// 用于接收浏览器发送请求中的 参数数据
// 当前类在OperationController中使用
public class SaveOptParam {

    private Integer optType; // 操作类型：0-点击  1-绽放 2-拖拽

    private String stationId;
    private String stationName;

    private Double zoomStartLevel;
    private Double zoomEndLevel;

    private Double dragStartLat;
    private Double dragStartLon;
    private Double dragEndLat;
    private Double dragEndLon;

    public SaveOptParam() {
    }

    public Integer getOptType() {
        return optType;
    }

    public void setOptType(Integer optType) {
        this.optType = optType;
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

    public Double getZoomStartLevel() {
        return zoomStartLevel;
    }

    public void setZoomStartLevel(Double zoomStartLevel) {
        this.zoomStartLevel = zoomStartLevel;
    }

    public Double getZoomEndLevel() {
        return zoomEndLevel;
    }

    public void setZoomEndLevel(Double zoomEndLevel) {
        this.zoomEndLevel = zoomEndLevel;
    }

    public Double getDragStartLat() {
        return dragStartLat;
    }

    public void setDragStartLat(Double dragStartLat) {
        this.dragStartLat = dragStartLat;
    }

    public Double getDragStartLon() {
        return dragStartLon;
    }

    public void setDragStartLon(Double dragStartLon) {
        this.dragStartLon = dragStartLon;
    }

    public Double getDragEndLat() {
        return dragEndLat;
    }

    public void setDragEndLat(Double dragEndLat) {
        this.dragEndLat = dragEndLat;
    }

    public Double getDragEndLon() {
        return dragEndLon;
    }

    public void setDragEndLon(Double dragEndLon) {
        this.dragEndLon = dragEndLon;
    }

    @Override
    public String toString() {
        return "SaveOptParam{" +
                "optType=" + optType +
                ", stationId='" + stationId + '\'' +
                ", stationName='" + stationName + '\'' +
                ", zoomStartLevel=" + zoomStartLevel +
                ", zoomEndLevel=" + zoomEndLevel +
                ", dragStartLat=" + dragStartLat +
                ", dragStartLon=" + dragStartLon +
                ", dragEndLat=" + dragEndLat +
                ", dragEndLon=" + dragEndLon +
                '}';
    }
}

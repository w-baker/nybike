package pers.rain.pojo;

/**
 * 拖拽页面对应的实体类
 * @Auther: W-CH
 * @Time: 2022-12-20 20:56
 * @E-mail: wang.xiaohong.0817@gmail.com
 * @Software: IntelliJ IDEA
 */
public class OptDragDO extends OptBaseDO{
    private Double dragStartLat;
    private Double dragStartLon;
    private Double dragEndLat;
    private Double dragEndLon;
    
    public OptDragDO() {
    }
    
    public OptDragDO(Double dragStartLat, Double dragStartLon, Double dragEndLat, Double dragEndLon) {
        this.dragStartLat = dragStartLat;
        this.dragStartLon = dragStartLon;
        this.dragEndLat = dragEndLat;
        this.dragEndLon = dragEndLon;
    }
    
    public OptDragDO(Integer optId, Double dragStartLat, Double dragStartLon, Double dragEndLat, Double dragEndLon) {
        super(optId);
        this.dragStartLat = dragStartLat;
        this.dragStartLon = dragStartLon;
        this.dragEndLat = dragEndLat;
        this.dragEndLon = dragEndLon;
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
        return "OptDragDO{" +
                       "dragStartLat=" + dragStartLat +
                       ", dragStartLon=" + dragStartLon +
                       ", dragEndLat=" + dragEndLat +
                       ", dragEndLon=" + dragEndLon +
                       '}';
    }
}

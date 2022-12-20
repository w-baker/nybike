package pers.rain.pojo;

/**
 * 缩放页面对应的类
 * @Auther: W-CH
 * @Time: 2022-12-20 20:52
 * @E-mail: wang.xiaohong.0817@gmail.com
 * @Software: IntelliJ IDEA
 */
public class OptZoomDO extends OptBaseDO{
    private Double zoomStartLevel;
    private Double zoomEndLevel;
    
    public OptZoomDO() {
    }
    
    public OptZoomDO(Double zoomStartLevel, Double zoomEndLevel) {
        this.zoomStartLevel = zoomStartLevel;
        this.zoomEndLevel = zoomEndLevel;
    }
    
    public OptZoomDO(Integer optId, Double zoomStartLevel, Double zoomEndLevel) {
        super(optId);
        this.zoomStartLevel = zoomStartLevel;
        this.zoomEndLevel = zoomEndLevel;
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
    
    @Override
    public String toString() {
        return "OptZoomDO{" +
                       "zoomStartLevel=" + zoomStartLevel +
                       ", zoomEndLevel=" + zoomEndLevel +
                       '}';
    }
}

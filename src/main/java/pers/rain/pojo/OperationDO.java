package pers.rain.pojo;


import java.util.Date;
import java.util.Objects;

public class OperationDO {
public static final int OPT_TYPE_CLICK = 0;
public static final int OPT_TYPE_ZOOM = 1;
public static final int OPT_TYPE_DRAG = 2;

    private Integer id;
        // 包装类 Integer 和 int 值的区别
        // Integer可以保存的值：-21亿到21亿，以及null，默认值是null
        // int可以保存的值：-21亿到21亿，默认值是 0
    private Integer optType;  // 操作类型：0-点击  1-绽放 2-拖拽
    private String userIp;
    private Date createdTime;

    public OperationDO() {
    }

    public OperationDO(Integer id, Integer optType, String userIp, Date createdTime) {
        this.id = id;
        this.optType = optType;
        this.userIp = userIp;
        this.createdTime = createdTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOptType() {
        return optType;
    }

    public void setOptType(Integer optType) {
        this.optType = optType;
    }

    public String getUserIp() {
        return userIp;
    }

    public void setUserIp(String userIp) {
        this.userIp = userIp;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OperationDO that = (OperationDO) o;
        return Objects.equals(id, that.id) && Objects.equals(optType, that.optType) && Objects.equals(userIp, that.userIp) && Objects.equals(createdTime, that.createdTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, optType, userIp, createdTime);
    }

    @Override
    public String toString() {
        return "OperationDO{" +
                "id=" + id +
                ", optType=" + optType +
                ", userIp='" + userIp + '\'' +
                ", createdTime=" + createdTime +
                '}';
    }
}

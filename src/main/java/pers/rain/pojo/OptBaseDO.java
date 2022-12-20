package pers.rain.pojo;

import java.util.Objects;

public class OptBaseDO {
    private Integer optId;

    public OptBaseDO() {
    }

    public OptBaseDO(Integer optId) {
        this.optId = optId;
    }

    public Integer getOptId() {
        return optId;
    }

    public void setOptId(Integer optId) {
        this.optId = optId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OptBaseDO optBaseDO = (OptBaseDO) o;
        return Objects.equals(optId, optBaseDO.optId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(optId);
    }

    @Override
    public String toString() {
        return "OptBaseDO{" +
                "optId=" + optId +
                '}';
    }
}

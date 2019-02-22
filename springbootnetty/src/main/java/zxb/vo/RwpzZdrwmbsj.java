package zxb.vo;

import java.util.Objects;

public class RwpzZdrwmbsj {
    private int mbbs;
    private String gyxbm;
    private Integer gyxxh;

    public int getMbbs() {
        return mbbs;
    }

    public void setMbbs(int mbbs) {
        this.mbbs = mbbs;
    }

    public String getGyxbm() {
        return gyxbm;
    }

    public void setGyxbm(String gyxbm) {
        this.gyxbm = gyxbm;
    }

    public Integer getGyxxh() {
        return gyxxh;
    }

    public void setGyxxh(Integer gyxxh) {
        this.gyxxh = gyxxh;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RwpzZdrwmbsj that = (RwpzZdrwmbsj) o;
        return mbbs == that.mbbs &&
                Objects.equals(gyxbm, that.gyxbm) &&
                Objects.equals(gyxxh, that.gyxxh);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mbbs, gyxbm, gyxxh);
    }
}

package zxb.vo;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Objects;

public class YwRwbc {
    private String rwxl;
    private String zdlx;
    private BigInteger rwh;
    private BigInteger bccs;
    private String bcsj;
    private Timestamp czrq;
    private String czybh;
    private BigInteger sfyx;

    public String getRwxl() {
        return rwxl;
    }

    public void setRwxl(String rwxl) {
        this.rwxl = rwxl;
    }

    public String getZdlx() {
        return zdlx;
    }

    public void setZdlx(String zdlx) {
        this.zdlx = zdlx;
    }

    public BigInteger getRwh() {
        return rwh;
    }

    public void setRwh(BigInteger rwh) {
        this.rwh = rwh;
    }

    public BigInteger getBccs() {
        return bccs;
    }

    public void setBccs(BigInteger bccs) {
        this.bccs = bccs;
    }

    public String getBcsj() {
        return bcsj;
    }

    public void setBcsj(String bcsj) {
        this.bcsj = bcsj;
    }

    public Timestamp getCzrq() {
        return czrq;
    }

    public void setCzrq(Timestamp czrq) {
        this.czrq = czrq;
    }

    public String getCzybh() {
        return czybh;
    }

    public void setCzybh(String czybh) {
        this.czybh = czybh;
    }

    public BigInteger getSfyx() {
        return sfyx;
    }

    public void setSfyx(BigInteger sfyx) {
        this.sfyx = sfyx;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        YwRwbc ywRwbc = (YwRwbc) o;
        return Objects.equals(rwxl, ywRwbc.rwxl) &&
                Objects.equals(zdlx, ywRwbc.zdlx) &&
                Objects.equals(rwh, ywRwbc.rwh) &&
                Objects.equals(bccs, ywRwbc.bccs) &&
                Objects.equals(bcsj, ywRwbc.bcsj) &&
                Objects.equals(czrq, ywRwbc.czrq) &&
                Objects.equals(czybh, ywRwbc.czybh) &&
                Objects.equals(sfyx, ywRwbc.sfyx);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rwxl, zdlx, rwh, bccs, bcsj, czrq, czybh, sfyx);
    }
}

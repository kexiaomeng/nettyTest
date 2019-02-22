package zxb.common.listen.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Objects;

public class GkDl {
    private int dlBh;
    private String dlMc;
    private Integer dlLx;
    private Integer dlDz;
    private Integer dbBh;
    private Integer sfXzJy;
    private Integer xzJyJg;
    private BigDecimal xzXx;
    private BigDecimal xzSx;
    private Timestamp xzJySb;

    public int getDlBh() {
        return dlBh;
    }

    public void setDlBh(int dlBh) {
        this.dlBh = dlBh;
    }

    public String getDlMc() {
        return dlMc;
    }

    public void setDlMc(String dlMc) {
        this.dlMc = dlMc;
    }

    public Integer getDlLx() {
        return dlLx;
    }

    public void setDlLx(Integer dlLx) {
        this.dlLx = dlLx;
    }

    public Integer getDlDz() {
        return dlDz;
    }

    public void setDlDz(Integer dlDz) {
        this.dlDz = dlDz;
    }

    public Integer getDbBh() {
        return dbBh;
    }

    public void setDbBh(Integer dbBh) {
        this.dbBh = dbBh;
    }

    public Integer getSfXzJy() {
        return sfXzJy;
    }

    public void setSfXzJy(Integer sfXzJy) {
        this.sfXzJy = sfXzJy;
    }

    public Integer getXzJyJg() {
        return xzJyJg;
    }

    public void setXzJyJg(Integer xzJyJg) {
        this.xzJyJg = xzJyJg;
    }

    public BigDecimal getXzXx() {
        return xzXx;
    }

    public void setXzXx(BigDecimal xzXx) {
        this.xzXx = xzXx;
    }

    public BigDecimal getXzSx() {
        return xzSx;
    }

    public void setXzSx(BigDecimal xzSx) {
        this.xzSx = xzSx;
    }

    public Timestamp getXzJySb() {
        return xzJySb;
    }

    public void setXzJySb(Timestamp xzJySb) {
        this.xzJySb = xzJySb;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GkDl gkDl = (GkDl) o;
        return dlBh == gkDl.dlBh &&
                Objects.equals(dlMc, gkDl.dlMc) &&
                Objects.equals(dlLx, gkDl.dlLx) &&
                Objects.equals(dlDz, gkDl.dlDz) &&
                Objects.equals(dbBh, gkDl.dbBh) &&
                Objects.equals(sfXzJy, gkDl.sfXzJy) &&
                Objects.equals(xzJyJg, gkDl.xzJyJg) &&
                Objects.equals(xzXx, gkDl.xzXx) &&
                Objects.equals(xzSx, gkDl.xzSx) &&
                Objects.equals(xzJySb, gkDl.xzJySb);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dlBh, dlMc, dlLx, dlDz, dbBh, sfXzJy, xzJyJg, xzXx, xzSx, xzJySb);
    }
}

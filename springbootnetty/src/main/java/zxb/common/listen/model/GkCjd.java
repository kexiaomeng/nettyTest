package zxb.common.listen.model;

import java.sql.Timestamp;
import java.util.Objects;

public class GkCjd {
    private int cjdBh;
    private String cjdMc;
    private Integer cjzBh;
    private String czBh;
    private Integer rwmbBh;
    private Integer cjJg;
    private Integer csYc;
    private String dqBh;
    private Integer dqZt;
    private Integer cjdDz;
    private Integer yxj;
    private Timestamp zhCjSj;
    private Integer txFs;
    private Integer jgLx;
    private Timestamp cshSj;
    private Integer jgsjDw;
    private Integer yxfwBh;

    public int getCjdBh() {
        return cjdBh;
    }

    public void setCjdBh(int cjdBh) {
        this.cjdBh = cjdBh;
    }

    public String getCjdMc() {
        return cjdMc;
    }

    public void setCjdMc(String cjdMc) {
        this.cjdMc = cjdMc;
    }

    public Integer getCjzBh() {
        return cjzBh;
    }

    public void setCjzBh(Integer cjzBh) {
        this.cjzBh = cjzBh;
    }

    public String getCzBh() {
        return czBh;
    }

    public void setCzBh(String czBh) {
        this.czBh = czBh;
    }

    public Integer getRwmbBh() {
        return rwmbBh;
    }

    public void setRwmbBh(Integer rwmbBh) {
        this.rwmbBh = rwmbBh;
    }

    public Integer getCjJg() {
        return cjJg;
    }

    public void setCjJg(Integer cjJg) {
        this.cjJg = cjJg;
    }

    public Integer getCsYc() {
        return csYc;
    }

    public void setCsYc(Integer csYc) {
        this.csYc = csYc;
    }

    public String getDqBh() {
        return dqBh;
    }

    public void setDqBh(String dqBh) {
        this.dqBh = dqBh;
    }

    public Integer getDqZt() {
        return dqZt;
    }

    public void setDqZt(Integer dqZt) {
        this.dqZt = dqZt;
    }

    public Integer getCjdDz() {
        return cjdDz;
    }

    public void setCjdDz(Integer cjdDz) {
        this.cjdDz = cjdDz;
    }

    public Integer getYxj() {
        return yxj;
    }

    public void setYxj(Integer yxj) {
        this.yxj = yxj;
    }

    public Timestamp getZhCjSj() {
        return zhCjSj;
    }

    public void setZhCjSj(Timestamp zhCjSj) {
        this.zhCjSj = zhCjSj;
    }

    public Integer getTxFs() {
        return txFs;
    }

    public void setTxFs(Integer txFs) {
        this.txFs = txFs;
    }

    public Integer getJgLx() {
        return jgLx;
    }

    public void setJgLx(Integer jgLx) {
        this.jgLx = jgLx;
    }

    public Timestamp getCshSj() {
        return cshSj;
    }

    public void setCshSj(Timestamp cshSj) {
        this.cshSj = cshSj;
    }

    public Integer getJgsjDw() {
        return jgsjDw;
    }

    public void setJgsjDw(Integer jgsjDw) {
        this.jgsjDw = jgsjDw;
    }

    public Integer getYxfwBh() {
        return yxfwBh;
    }

    public void setYxfwBh(Integer yxfwBh) {
        this.yxfwBh = yxfwBh;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GkCjd gkCjd = (GkCjd) o;
        return cjdBh == gkCjd.cjdBh &&
                Objects.equals(cjdMc, gkCjd.cjdMc) &&
                Objects.equals(cjzBh, gkCjd.cjzBh) &&
                Objects.equals(czBh, gkCjd.czBh) &&
                Objects.equals(rwmbBh, gkCjd.rwmbBh) &&
                Objects.equals(cjJg, gkCjd.cjJg) &&
                Objects.equals(csYc, gkCjd.csYc) &&
                Objects.equals(dqBh, gkCjd.dqBh) &&
                Objects.equals(dqZt, gkCjd.dqZt) &&
                Objects.equals(cjdDz, gkCjd.cjdDz) &&
                Objects.equals(yxj, gkCjd.yxj) &&
                Objects.equals(zhCjSj, gkCjd.zhCjSj) &&
                Objects.equals(txFs, gkCjd.txFs) &&
                Objects.equals(jgLx, gkCjd.jgLx) &&
                Objects.equals(cshSj, gkCjd.cshSj) &&
                Objects.equals(jgsjDw, gkCjd.jgsjDw) &&
                Objects.equals(yxfwBh, gkCjd.yxfwBh);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cjdBh, cjdMc, cjzBh, czBh, rwmbBh, cjJg, csYc, dqBh, dqZt, cjdDz, yxj, zhCjSj, txFs, jgLx, cshSj, jgsjDw, yxfwBh);
    }
}

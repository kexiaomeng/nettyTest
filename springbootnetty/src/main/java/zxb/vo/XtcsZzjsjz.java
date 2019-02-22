package zxb.vo;

import java.math.BigInteger;
import java.sql.Timestamp;
import java.util.Objects;

public class XtcsZzjsjz {
    private int jsjId;
    private String jsjip;
    private String jsjm;
    private BigInteger jsjzlb;
    private BigInteger jsjzt;
    private BigInteger sfxyjk;
    private Integer jtdkh;
    private BigInteger yxj;
    private Integer zdxcs;
    private Integer wglx;
    private Integer jsjbh;
    private String sq;
    private Timestamp jsjsj;
    private Timestamp sychysj;

    public int getJsjId() {
        return jsjId;
    }

    public void setJsjId(int jsjId) {
        this.jsjId = jsjId;
    }

    public String getJsjip() {
        return jsjip;
    }

    public void setJsjip(String jsjip) {
        this.jsjip = jsjip;
    }

    public String getJsjm() {
        return jsjm;
    }

    public void setJsjm(String jsjm) {
        this.jsjm = jsjm;
    }

    public BigInteger getJsjzlb() {
        return jsjzlb;
    }

    public void setJsjzlb(BigInteger jsjzlb) {
        this.jsjzlb = jsjzlb;
    }

    public BigInteger getJsjzt() {
        return jsjzt;
    }

    public void setJsjzt(BigInteger jsjzt) {
        this.jsjzt = jsjzt;
    }

    public BigInteger getSfxyjk() {
        return sfxyjk;
    }

    public void setSfxyjk(BigInteger sfxyjk) {
        this.sfxyjk = sfxyjk;
    }

    public Integer getJtdkh() {
        return jtdkh;
    }

    public void setJtdkh(Integer jtdkh) {
        this.jtdkh = jtdkh;
    }

    public BigInteger getYxj() {
        return yxj;
    }

    public void setYxj(BigInteger yxj) {
        this.yxj = yxj;
    }

    public Integer getZdxcs() {
        return zdxcs;
    }

    public void setZdxcs(Integer zdxcs) {
        this.zdxcs = zdxcs;
    }

    public Integer getWglx() {
        return wglx;
    }

    public void setWglx(Integer wglx) {
        this.wglx = wglx;
    }

    public Integer getJsjbh() {
        return jsjbh;
    }

    public void setJsjbh(Integer jsjbh) {
        this.jsjbh = jsjbh;
    }

    public String getSq() {
        return sq;
    }

    public void setSq(String sq) {
        this.sq = sq;
    }

    public Timestamp getJsjsj() {
        return jsjsj;
    }

    public void setJsjsj(Timestamp jsjsj) {
        this.jsjsj = jsjsj;
    }

    public Timestamp getSychysj() {
        return sychysj;
    }

    public void setSychysj(Timestamp sychysj) {
        this.sychysj = sychysj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        XtcsZzjsjz that = (XtcsZzjsjz) o;
        return jsjId == that.jsjId &&
                Objects.equals(jsjip, that.jsjip) &&
                Objects.equals(jsjm, that.jsjm) &&
                Objects.equals(jsjzlb, that.jsjzlb) &&
                Objects.equals(jsjzt, that.jsjzt) &&
                Objects.equals(sfxyjk, that.sfxyjk) &&
                Objects.equals(jtdkh, that.jtdkh) &&
                Objects.equals(yxj, that.yxj) &&
                Objects.equals(zdxcs, that.zdxcs) &&
                Objects.equals(wglx, that.wglx) &&
                Objects.equals(jsjbh, that.jsjbh) &&
                Objects.equals(sq, that.sq) &&
                Objects.equals(jsjsj, that.jsjsj) &&
                Objects.equals(sychysj, that.sychysj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jsjId, jsjip, jsjm, jsjzlb, jsjzt, sfxyjk, jtdkh, yxj, zdxcs, wglx, jsjbh, sq, jsjsj, sychysj);
    }
}

package zxb.common.listen.model;

import java.sql.Timestamp;
import java.util.Objects;

public class GkWl {
    private int tdBh;
    private Integer gyBh;
    private String tdMc;
    private Integer cjdBh;
    private Integer zt;
    private String ipDz;
    private String cs;
    private Integer ipDk;
    private Integer ljFs;
    private Integer csCs;
    private Timestamp txSj;
    private Integer zdTxYc;
    private Integer qybz;
    private Integer yxfwBh;
    private Integer yxj;
    private Timestamp zhCgSj;

    public int getTdBh() {
        return tdBh;
    }

    public void setTdBh(int tdBh) {
        this.tdBh = tdBh;
    }

    public Integer getGyBh() {
        return gyBh;
    }

    public void setGyBh(Integer gyBh) {
        this.gyBh = gyBh;
    }

    public String getTdMc() {
        return tdMc;
    }

    public void setTdMc(String tdMc) {
        this.tdMc = tdMc;
    }

    public Integer getCjdBh() {
        return cjdBh;
    }

    public void setCjdBh(Integer cjdBh) {
        this.cjdBh = cjdBh;
    }

    public Integer getZt() {
        return zt;
    }

    public void setZt(Integer zt) {
        this.zt = zt;
    }

    public String getIpDz() {
        return ipDz;
    }

    public void setIpDz(String ipDz) {
        this.ipDz = ipDz;
    }

    public String getCs() {
        return cs;
    }

    public void setCs(String cs) {
        this.cs = cs;
    }

    public Integer getIpDk() {
        return ipDk;
    }

    public void setIpDk(Integer ipDk) {
        this.ipDk = ipDk;
    }

    public Integer getLjFs() {
        return ljFs;
    }

    public void setLjFs(Integer ljFs) {
        this.ljFs = ljFs;
    }

    public Integer getCsCs() {
        return csCs;
    }

    public void setCsCs(Integer csCs) {
        this.csCs = csCs;
    }

    public Timestamp getTxSj() {
        return txSj;
    }

    public void setTxSj(Timestamp txSj) {
        this.txSj = txSj;
    }

    public Integer getZdTxYc() {
        return zdTxYc;
    }

    public void setZdTxYc(Integer zdTxYc) {
        this.zdTxYc = zdTxYc;
    }

    public Integer getQybz() {
        return qybz;
    }

    public void setQybz(Integer qybz) {
        this.qybz = qybz;
    }

    public Integer getYxfwBh() {
        return yxfwBh;
    }

    public void setYxfwBh(Integer yxfwBh) {
        this.yxfwBh = yxfwBh;
    }

    public Integer getYxj() {
        return yxj;
    }

    public void setYxj(Integer yxj) {
        this.yxj = yxj;
    }

    public Timestamp getZhCgSj() {
        return zhCgSj;
    }

    public void setZhCgSj(Timestamp zhCgSj) {
        this.zhCgSj = zhCgSj;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GkWl gkWl = (GkWl) o;
        return tdBh == gkWl.tdBh &&
                Objects.equals(gyBh, gkWl.gyBh) &&
                Objects.equals(tdMc, gkWl.tdMc) &&
                Objects.equals(cjdBh, gkWl.cjdBh) &&
                Objects.equals(zt, gkWl.zt) &&
                Objects.equals(ipDz, gkWl.ipDz) &&
                Objects.equals(cs, gkWl.cs) &&
                Objects.equals(ipDk, gkWl.ipDk) &&
                Objects.equals(ljFs, gkWl.ljFs) &&
                Objects.equals(csCs, gkWl.csCs) &&
                Objects.equals(txSj, gkWl.txSj) &&
                Objects.equals(zdTxYc, gkWl.zdTxYc) &&
                Objects.equals(qybz, gkWl.qybz) &&
                Objects.equals(yxfwBh, gkWl.yxfwBh) &&
                Objects.equals(yxj, gkWl.yxj) &&
                Objects.equals(zhCgSj, gkWl.zhCgSj);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tdBh, gyBh, tdMc, cjdBh, zt, ipDz, cs, ipDk, ljFs, csCs, txSj, zdTxYc, qybz, yxfwBh, yxj, zhCgSj);
    }
}

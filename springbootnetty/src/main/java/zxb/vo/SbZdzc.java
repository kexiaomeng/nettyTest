package zxb.vo;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.Objects;

public class SbZdzc {
    private String zdzcbs;
    private String sblbdm;
    private String zcbh;
    private String ccbh;
    private String sccjbs;
    private BigDecimal eddy;
    private BigDecimal eddl;
    private String sbxhdm;
    private String gddwbm;
    private Date ccrq;
    private String txdz;
    private Date jdrq;
    private Date czsj;
    private Date cjsj;
    private String jxfsdm;
    private String jcbz;
    private String rjbbh;
    private String sxtxxddm;
    private String xxtxxddm;
    private String bdwhjkdm;
    private String sxtxgydm;
    private String xxtxgydm;
    private Integer sxxdls;
    private Integer xxxdls;
    private String dhpcbs;
    private String dhpch;
    private String zcztdm;

    public String getZdzcbs() {
        return zdzcbs;
    }

    public void setZdzcbs(String zdzcbs) {
        this.zdzcbs = zdzcbs;
    }

    public String getSblbdm() {
        return sblbdm;
    }

    public void setSblbdm(String sblbdm) {
        this.sblbdm = sblbdm;
    }

    public String getZcbh() {
        return zcbh;
    }

    public void setZcbh(String zcbh) {
        this.zcbh = zcbh;
    }

    public String getCcbh() {
        return ccbh;
    }

    public void setCcbh(String ccbh) {
        this.ccbh = ccbh;
    }

    public String getSccjbs() {
        return sccjbs;
    }

    public void setSccjbs(String sccjbs) {
        this.sccjbs = sccjbs;
    }

    public BigDecimal getEddy() {
        return eddy;
    }

    public void setEddy(BigDecimal eddy) {
        this.eddy = eddy;
    }

    public BigDecimal getEddl() {
        return eddl;
    }

    public void setEddl(BigDecimal eddl) {
        this.eddl = eddl;
    }

    public String getSbxhdm() {
        return sbxhdm;
    }

    public void setSbxhdm(String sbxhdm) {
        this.sbxhdm = sbxhdm;
    }

    public String getGddwbm() {
        return gddwbm;
    }

    public void setGddwbm(String gddwbm) {
        this.gddwbm = gddwbm;
    }

    public Date getCcrq() {
        return ccrq;
    }

    public void setCcrq(Date ccrq) {
        this.ccrq = ccrq;
    }

    public String getTxdz() {
        return txdz;
    }

    public void setTxdz(String txdz) {
        this.txdz = txdz;
    }

    public Date getJdrq() {
        return jdrq;
    }

    public void setJdrq(Date jdrq) {
        this.jdrq = jdrq;
    }

    public Date getCzsj() {
        return czsj;
    }

    public void setCzsj(Date czsj) {
        this.czsj = czsj;
    }

    public Date getCjsj() {
        return cjsj;
    }

    public void setCjsj(Date cjsj) {
        this.cjsj = cjsj;
    }

    public String getJxfsdm() {
        return jxfsdm;
    }

    public void setJxfsdm(String jxfsdm) {
        this.jxfsdm = jxfsdm;
    }

    public String getJcbz() {
        return jcbz;
    }

    public void setJcbz(String jcbz) {
        this.jcbz = jcbz;
    }

    public String getRjbbh() {
        return rjbbh;
    }

    public void setRjbbh(String rjbbh) {
        this.rjbbh = rjbbh;
    }

    public String getSxtxxddm() {
        return sxtxxddm;
    }

    public void setSxtxxddm(String sxtxxddm) {
        this.sxtxxddm = sxtxxddm;
    }

    public String getXxtxxddm() {
        return xxtxxddm;
    }

    public void setXxtxxddm(String xxtxxddm) {
        this.xxtxxddm = xxtxxddm;
    }

    public String getBdwhjkdm() {
        return bdwhjkdm;
    }

    public void setBdwhjkdm(String bdwhjkdm) {
        this.bdwhjkdm = bdwhjkdm;
    }

    public String getSxtxgydm() {
        return sxtxgydm;
    }

    public void setSxtxgydm(String sxtxgydm) {
        this.sxtxgydm = sxtxgydm;
    }

    public String getXxtxgydm() {
        return xxtxgydm;
    }

    public void setXxtxgydm(String xxtxgydm) {
        this.xxtxgydm = xxtxgydm;
    }

    public Integer getSxxdls() {
        return sxxdls;
    }

    public void setSxxdls(Integer sxxdls) {
        this.sxxdls = sxxdls;
    }

    public Integer getXxxdls() {
        return xxxdls;
    }

    public void setXxxdls(Integer xxxdls) {
        this.xxxdls = xxxdls;
    }

    public String getDhpcbs() {
        return dhpcbs;
    }

    public void setDhpcbs(String dhpcbs) {
        this.dhpcbs = dhpcbs;
    }

    public String getDhpch() {
        return dhpch;
    }

    public void setDhpch(String dhpch) {
        this.dhpch = dhpch;
    }

    public String getZcztdm() {
        return zcztdm;
    }

    public void setZcztdm(String zcztdm) {
        this.zcztdm = zcztdm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SbZdzc sbZdzc = (SbZdzc) o;
        return Objects.equals(zdzcbs, sbZdzc.zdzcbs) &&
                Objects.equals(sblbdm, sbZdzc.sblbdm) &&
                Objects.equals(zcbh, sbZdzc.zcbh) &&
                Objects.equals(ccbh, sbZdzc.ccbh) &&
                Objects.equals(sccjbs, sbZdzc.sccjbs) &&
                Objects.equals(eddy, sbZdzc.eddy) &&
                Objects.equals(eddl, sbZdzc.eddl) &&
                Objects.equals(sbxhdm, sbZdzc.sbxhdm) &&
                Objects.equals(gddwbm, sbZdzc.gddwbm) &&
                Objects.equals(ccrq, sbZdzc.ccrq) &&
                Objects.equals(txdz, sbZdzc.txdz) &&
                Objects.equals(jdrq, sbZdzc.jdrq) &&
                Objects.equals(czsj, sbZdzc.czsj) &&
                Objects.equals(cjsj, sbZdzc.cjsj) &&
                Objects.equals(jxfsdm, sbZdzc.jxfsdm) &&
                Objects.equals(jcbz, sbZdzc.jcbz) &&
                Objects.equals(rjbbh, sbZdzc.rjbbh) &&
                Objects.equals(sxtxxddm, sbZdzc.sxtxxddm) &&
                Objects.equals(xxtxxddm, sbZdzc.xxtxxddm) &&
                Objects.equals(bdwhjkdm, sbZdzc.bdwhjkdm) &&
                Objects.equals(sxtxgydm, sbZdzc.sxtxgydm) &&
                Objects.equals(xxtxgydm, sbZdzc.xxtxgydm) &&
                Objects.equals(sxxdls, sbZdzc.sxxdls) &&
                Objects.equals(xxxdls, sbZdzc.xxxdls) &&
                Objects.equals(dhpcbs, sbZdzc.dhpcbs) &&
                Objects.equals(dhpch, sbZdzc.dhpch) &&
                Objects.equals(zcztdm, sbZdzc.zcztdm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(zdzcbs, sblbdm, zcbh, ccbh, sccjbs, eddy, eddl, sbxhdm, gddwbm, ccrq, txdz, jdrq, czsj, cjsj, jxfsdm, jcbz, rjbbh, sxtxxddm, xxtxxddm, bdwhjkdm, sxtxgydm, xxtxgydm, sxxdls, xxxdls, dhpcbs, dhpch, zcztdm);
    }
}

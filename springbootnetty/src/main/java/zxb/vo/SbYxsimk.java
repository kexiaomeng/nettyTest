package zxb.vo;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.Objects;

public class SbYxsimk {
    private String simkyxbs;
    private String simxlh;
    private String simkzcbh;
    private String sjhm;
    private String ipdz;
    private String sblbdm;
    private String sbbs;
    private String sbzcbh;
    private String yysdm;
    private String txwl;
    private String gddwbm;
    private Date czsj;
    private Date cjsj;
    private BigDecimal simrl;
    private String simkzczt;
    private String drpch;
    private String dhpch;
    private String zdzcbs;

    public String getSimkyxbs() {
        return simkyxbs;
    }

    public void setSimkyxbs(String simkyxbs) {
        this.simkyxbs = simkyxbs;
    }

    public String getSimxlh() {
        return simxlh;
    }

    public void setSimxlh(String simxlh) {
        this.simxlh = simxlh;
    }

    public String getSimkzcbh() {
        return simkzcbh;
    }

    public void setSimkzcbh(String simkzcbh) {
        this.simkzcbh = simkzcbh;
    }

    public String getSjhm() {
        return sjhm;
    }

    public void setSjhm(String sjhm) {
        this.sjhm = sjhm;
    }

    public String getIpdz() {
        return ipdz;
    }

    public void setIpdz(String ipdz) {
        this.ipdz = ipdz;
    }

    public String getSblbdm() {
        return sblbdm;
    }

    public void setSblbdm(String sblbdm) {
        this.sblbdm = sblbdm;
    }

    public String getSbbs() {
        return sbbs;
    }

    public void setSbbs(String sbbs) {
        this.sbbs = sbbs;
    }

    public String getSbzcbh() {
        return sbzcbh;
    }

    public void setSbzcbh(String sbzcbh) {
        this.sbzcbh = sbzcbh;
    }

    public String getYysdm() {
        return yysdm;
    }

    public void setYysdm(String yysdm) {
        this.yysdm = yysdm;
    }

    public String getTxwl() {
        return txwl;
    }

    public void setTxwl(String txwl) {
        this.txwl = txwl;
    }

    public String getGddwbm() {
        return gddwbm;
    }

    public void setGddwbm(String gddwbm) {
        this.gddwbm = gddwbm;
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

    public BigDecimal getSimrl() {
        return simrl;
    }

    public void setSimrl(BigDecimal simrl) {
        this.simrl = simrl;
    }

    public String getSimkzczt() {
        return simkzczt;
    }

    public void setSimkzczt(String simkzczt) {
        this.simkzczt = simkzczt;
    }

    public String getDrpch() {
        return drpch;
    }

    public void setDrpch(String drpch) {
        this.drpch = drpch;
    }

    public String getDhpch() {
        return dhpch;
    }

    public void setDhpch(String dhpch) {
        this.dhpch = dhpch;
    }

    public String getZdzcbs() {
        return zdzcbs;
    }

    public void setZdzcbs(String zdzcbs) {
        this.zdzcbs = zdzcbs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SbYxsimk sbYxsimk = (SbYxsimk) o;
        return Objects.equals(simkyxbs, sbYxsimk.simkyxbs) &&
                Objects.equals(simxlh, sbYxsimk.simxlh) &&
                Objects.equals(simkzcbh, sbYxsimk.simkzcbh) &&
                Objects.equals(sjhm, sbYxsimk.sjhm) &&
                Objects.equals(ipdz, sbYxsimk.ipdz) &&
                Objects.equals(sblbdm, sbYxsimk.sblbdm) &&
                Objects.equals(sbbs, sbYxsimk.sbbs) &&
                Objects.equals(sbzcbh, sbYxsimk.sbzcbh) &&
                Objects.equals(yysdm, sbYxsimk.yysdm) &&
                Objects.equals(txwl, sbYxsimk.txwl) &&
                Objects.equals(gddwbm, sbYxsimk.gddwbm) &&
                Objects.equals(czsj, sbYxsimk.czsj) &&
                Objects.equals(cjsj, sbYxsimk.cjsj) &&
                Objects.equals(simrl, sbYxsimk.simrl) &&
                Objects.equals(simkzczt, sbYxsimk.simkzczt) &&
                Objects.equals(drpch, sbYxsimk.drpch) &&
                Objects.equals(dhpch, sbYxsimk.dhpch) &&
                Objects.equals(zdzcbs, sbYxsimk.zdzcbs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(simkyxbs, simxlh, simkzcbh, sjhm, ipdz, sblbdm, sbbs, sbzcbh, yysdm, txwl, gddwbm, czsj, cjsj, simrl, simkzczt, drpch, dhpch, zdzcbs);
    }
}

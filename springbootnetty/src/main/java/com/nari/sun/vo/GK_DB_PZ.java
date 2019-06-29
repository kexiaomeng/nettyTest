package com.nari.sun.vo;

import java.sql.Timestamp;
import java.util.Objects;

public class GK_DB_PZ {
    private int PZ_BH;
    private String PZ_MC;
    private Integer SCCJ_BH;
    private Integer XH_BH;
    private Timestamp SC_RQ;
    private Integer GY_BH;

    public int getPZ_BH() {
        return PZ_BH;
    }

    public void setPZ_BH(int PZ_BH) {
        this.PZ_BH = PZ_BH;
    }

    public String getPZ_MC() {
        return PZ_MC;
    }

    public void setPZ_MC(String PZ_MC) {
        this.PZ_MC = PZ_MC;
    }

    public Integer getSCCJ_BH() {
        return SCCJ_BH;
    }

    public void setSCCJ_BH(Integer SCCJ_BH) {
        this.SCCJ_BH = SCCJ_BH;
    }

    public Integer getXH_BH() {
        return XH_BH;
    }

    public void setXH_BH(Integer XH_BH) {
        this.XH_BH = XH_BH;
    }

    public Timestamp getSC_RQ() {
        return SC_RQ;
    }

    public void setSC_RQ(Timestamp SC_RQ) {
        this.SC_RQ = SC_RQ;
    }

    public Integer getGY_BH() {
        return GY_BH;
    }

    public void setGY_BH(Integer GY_BH) {
        this.GY_BH = GY_BH;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GK_DB_PZ gk_db_pz = (GK_DB_PZ) o;
        return PZ_BH == gk_db_pz.PZ_BH &&
                Objects.equals(PZ_MC, gk_db_pz.PZ_MC) &&
                Objects.equals(SCCJ_BH, gk_db_pz.SCCJ_BH) &&
                Objects.equals(XH_BH, gk_db_pz.XH_BH) &&
                Objects.equals(SC_RQ, gk_db_pz.SC_RQ) &&
                Objects.equals(GY_BH, gk_db_pz.GY_BH);
    }

    @Override
    public int hashCode() {
        return Objects.hash(PZ_BH, PZ_MC, SCCJ_BH, XH_BH, SC_RQ, GY_BH);
    }
}

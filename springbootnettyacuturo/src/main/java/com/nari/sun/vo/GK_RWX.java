package com.nari.sun.vo;

import java.sql.Timestamp;
import java.util.Objects;

public class GK_RWX {
    private int RWX_BH;
    private Integer MB_BH;
    private Integer RW_LX;
    private Integer RW_JG;
    private Integer CS_YC;
    private Timestamp CJ_SJ;
    private String RW_MC;
    private Timestamp CZSJ;

    public int getRWX_BH() {
        return RWX_BH;
    }

    public void setRWX_BH(int RWX_BH) {
        this.RWX_BH = RWX_BH;
    }

    public Integer getMB_BH() {
        return MB_BH;
    }

    public void setMB_BH(Integer MB_BH) {
        this.MB_BH = MB_BH;
    }

    public Integer getRW_LX() {
        return RW_LX;
    }

    public void setRW_LX(Integer RW_LX) {
        this.RW_LX = RW_LX;
    }

    public Integer getRW_JG() {
        return RW_JG;
    }

    public void setRW_JG(Integer RW_JG) {
        this.RW_JG = RW_JG;
    }

    public Integer getCS_YC() {
        return CS_YC;
    }

    public void setCS_YC(Integer CS_YC) {
        this.CS_YC = CS_YC;
    }

    public Timestamp getCJ_SJ() {
        return CJ_SJ;
    }

    public void setCJ_SJ(Timestamp CJ_SJ) {
        this.CJ_SJ = CJ_SJ;
    }

    public String getRW_MC() {
        return RW_MC;
    }

    public void setRW_MC(String RW_MC) {
        this.RW_MC = RW_MC;
    }

    public Timestamp getCZSJ() {
        return CZSJ;
    }

    public void setCZSJ(Timestamp CZSJ) {
        this.CZSJ = CZSJ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GK_RWX gk_rwx = (GK_RWX) o;
        return RWX_BH == gk_rwx.RWX_BH &&
                Objects.equals(MB_BH, gk_rwx.MB_BH) &&
                Objects.equals(RW_LX, gk_rwx.RW_LX) &&
                Objects.equals(RW_JG, gk_rwx.RW_JG) &&
                Objects.equals(CS_YC, gk_rwx.CS_YC) &&
                Objects.equals(CJ_SJ, gk_rwx.CJ_SJ) &&
                Objects.equals(RW_MC, gk_rwx.RW_MC) &&
                Objects.equals(CZSJ, gk_rwx.CZSJ);
    }

    @Override
    public int hashCode() {
        return Objects.hash(RWX_BH, MB_BH, RW_LX, RW_JG, CS_YC, CJ_SJ, RW_MC, CZSJ);
    }
}

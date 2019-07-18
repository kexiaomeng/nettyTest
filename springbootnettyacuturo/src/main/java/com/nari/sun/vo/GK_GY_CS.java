package com.nari.sun.vo;

import java.util.Objects;

public class GK_GY_CS {
    private int GY_BH;
    private String CS_MC;
    private String CSZ;
    private Integer CS_XH;
    private Integer BH;

    public int getGY_BH() {
        return GY_BH;
    }

    public void setGY_BH(int GY_BH) {
        this.GY_BH = GY_BH;
    }

    public String getCS_MC() {
        return CS_MC;
    }

    public void setCS_MC(String CS_MC) {
        this.CS_MC = CS_MC;
    }

    public String getCSZ() {
        return CSZ;
    }

    public void setCSZ(String CSZ) {
        this.CSZ = CSZ;
    }

    public Integer getCS_XH() {
        return CS_XH;
    }

    public void setCS_XH(Integer CS_XH) {
        this.CS_XH = CS_XH;
    }

    public Integer getBH() {
        return BH;
    }

    public void setBH(Integer BH) {
        this.BH = BH;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GK_GY_CS gk_gy_cs = (GK_GY_CS) o;
        return GY_BH == gk_gy_cs.GY_BH &&
                Objects.equals(CS_MC, gk_gy_cs.CS_MC) &&
                Objects.equals(CSZ, gk_gy_cs.CSZ) &&
                Objects.equals(CS_XH, gk_gy_cs.CS_XH) &&
                Objects.equals(BH, gk_gy_cs.BH);
    }

    @Override
    public int hashCode() {
        return Objects.hash(GY_BH, CS_MC, CSZ, CS_XH, BH);
    }
}

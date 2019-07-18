package com.nari.sun.vo;

import java.io.Serializable;
import java.util.Objects;

public class GK_GY_CSPK implements Serializable {
    private int GY_BH;
    private String CS_MC;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GK_GY_CSPK that = (GK_GY_CSPK) o;
        return GY_BH == that.GY_BH &&
                Objects.equals(CS_MC, that.CS_MC);
    }

    @Override
    public int hashCode() {
        return Objects.hash(GY_BH, CS_MC);
    }
}

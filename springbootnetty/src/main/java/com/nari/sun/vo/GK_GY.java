package com.nari.sun.vo;

import java.util.Objects;

public class GK_GY {
    private int GY_BH;
    private String GY_MC;
    private String GY_BM;
    private String LM;
    private String BBH;

    public int getGY_BH() {
        return GY_BH;
    }

    public void setGY_BH(int GY_BH) {
        this.GY_BH = GY_BH;
    }

    public String getGY_MC() {
        return GY_MC;
    }

    public void setGY_MC(String GY_MC) {
        this.GY_MC = GY_MC;
    }

    public String getGY_BM() {
        return GY_BM;
    }

    public void setGY_BM(String GY_BM) {
        this.GY_BM = GY_BM;
    }

    public String getLM() {
        return LM;
    }

    public void setLM(String LM) {
        this.LM = LM;
    }

    public String getBBH() {
        return BBH;
    }

    public void setBBH(String BBH) {
        this.BBH = BBH;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GK_GY gk_gy = (GK_GY) o;
        return GY_BH == gk_gy.GY_BH &&
                Objects.equals(GY_MC, gk_gy.GY_MC) &&
                Objects.equals(GY_BM, gk_gy.GY_BM) &&
                Objects.equals(LM, gk_gy.LM) &&
                Objects.equals(BBH, gk_gy.BBH);
    }

    @Override
    public int hashCode() {
        return Objects.hash(GY_BH, GY_MC, GY_BM, LM, BBH);
    }
}

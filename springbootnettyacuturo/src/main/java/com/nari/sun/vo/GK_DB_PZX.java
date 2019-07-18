package com.nari.sun.vo;

import java.math.BigDecimal;
import java.util.Objects;

public class GK_DB_PZX {
    private int BH;
    private Integer PZ_ID;
    private Integer SJX;
    private BigDecimal JD;
    private Integer JF_ZQ;
    private Integer CS1;
    private Integer CS2;
    private Integer CS3;
    private Integer CS4;
    private BigDecimal XS1;
    private BigDecimal XS2;
    private BigDecimal XS3;
    private BigDecimal XS4;

    public int getBH() {
        return BH;
    }

    public void setBH(int BH) {
        this.BH = BH;
    }

    public Integer getPZ_ID() {
        return PZ_ID;
    }

    public void setPZ_ID(Integer PZ_ID) {
        this.PZ_ID = PZ_ID;
    }

    public Integer getSJX() {
        return SJX;
    }

    public void setSJX(Integer SJX) {
        this.SJX = SJX;
    }

    public BigDecimal getJD() {
        return JD;
    }

    public void setJD(BigDecimal JD) {
        this.JD = JD;
    }

    public Integer getJF_ZQ() {
        return JF_ZQ;
    }

    public void setJF_ZQ(Integer JF_ZQ) {
        this.JF_ZQ = JF_ZQ;
    }

    public Integer getCS1() {
        return CS1;
    }

    public void setCS1(Integer CS1) {
        this.CS1 = CS1;
    }

    public Integer getCS2() {
        return CS2;
    }

    public void setCS2(Integer CS2) {
        this.CS2 = CS2;
    }

    public Integer getCS3() {
        return CS3;
    }

    public void setCS3(Integer CS3) {
        this.CS3 = CS3;
    }

    public Integer getCS4() {
        return CS4;
    }

    public void setCS4(Integer CS4) {
        this.CS4 = CS4;
    }

    public BigDecimal getXS1() {
        return XS1;
    }

    public void setXS1(BigDecimal XS1) {
        this.XS1 = XS1;
    }

    public BigDecimal getXS2() {
        return XS2;
    }

    public void setXS2(BigDecimal XS2) {
        this.XS2 = XS2;
    }

    public BigDecimal getXS3() {
        return XS3;
    }

    public void setXS3(BigDecimal XS3) {
        this.XS3 = XS3;
    }

    public BigDecimal getXS4() {
        return XS4;
    }

    public void setXS4(BigDecimal XS4) {
        this.XS4 = XS4;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GK_DB_PZX gk_db_pzx = (GK_DB_PZX) o;
        return BH == gk_db_pzx.BH &&
                Objects.equals(PZ_ID, gk_db_pzx.PZ_ID) &&
                Objects.equals(SJX, gk_db_pzx.SJX) &&
                Objects.equals(JD, gk_db_pzx.JD) &&
                Objects.equals(JF_ZQ, gk_db_pzx.JF_ZQ) &&
                Objects.equals(CS1, gk_db_pzx.CS1) &&
                Objects.equals(CS2, gk_db_pzx.CS2) &&
                Objects.equals(CS3, gk_db_pzx.CS3) &&
                Objects.equals(CS4, gk_db_pzx.CS4) &&
                Objects.equals(XS1, gk_db_pzx.XS1) &&
                Objects.equals(XS2, gk_db_pzx.XS2) &&
                Objects.equals(XS3, gk_db_pzx.XS3) &&
                Objects.equals(XS4, gk_db_pzx.XS4);
    }

    @Override
    public int hashCode() {
        return Objects.hash(BH, PZ_ID, SJX, JD, JF_ZQ, CS1, CS2, CS3, CS4, XS1, XS2, XS3, XS4);
    }
}

package zxb.common.listen.model;

import java.sql.Timestamp;
import java.util.Objects;

public class GkDlcdzd {
    private int zdBh;
    private String zdMc;
    private Integer cjdBh;
    private Integer zdLx;
    private String zdDz;
    private String yhm;
    private String mm;
    private Integer sccjBh;
    private Integer xhBh;
    private Integer ccRl;
    private Integer zt;
    private Integer qybz;
    private Integer gyBh;
    private Timestamp sb1;
    private Timestamp sb2;
    private Timestamp sb3;
    private Timestamp sb4;
    private Timestamp sb5;
    private Timestamp sb6;
    private Timestamp sb7;
    private Timestamp sb8;
    private Timestamp sb9;
    private Timestamp sb10;

    public int getZdBh() {
        return zdBh;
    }

    public void setZdBh(int zdBh) {
        this.zdBh = zdBh;
    }

    public String getZdMc() {
        return zdMc;
    }

    public void setZdMc(String zdMc) {
        this.zdMc = zdMc;
    }

    public Integer getCjdBh() {
        return cjdBh;
    }

    public void setCjdBh(Integer cjdBh) {
        this.cjdBh = cjdBh;
    }

    public Integer getZdLx() {
        return zdLx;
    }

    public void setZdLx(Integer zdLx) {
        this.zdLx = zdLx;
    }

    public String getZdDz() {
        return zdDz;
    }

    public void setZdDz(String zdDz) {
        this.zdDz = zdDz;
    }

    public String getYhm() {
        return yhm;
    }

    public void setYhm(String yhm) {
        this.yhm = yhm;
    }

    public String getMm() {
        return mm;
    }

    public void setMm(String mm) {
        this.mm = mm;
    }

    public Integer getSccjBh() {
        return sccjBh;
    }

    public void setSccjBh(Integer sccjBh) {
        this.sccjBh = sccjBh;
    }

    public Integer getXhBh() {
        return xhBh;
    }

    public void setXhBh(Integer xhBh) {
        this.xhBh = xhBh;
    }

    public Integer getCcRl() {
        return ccRl;
    }

    public void setCcRl(Integer ccRl) {
        this.ccRl = ccRl;
    }

    public Integer getZt() {
        return zt;
    }

    public void setZt(Integer zt) {
        this.zt = zt;
    }

    public Integer getQybz() {
        return qybz;
    }

    public void setQybz(Integer qybz) {
        this.qybz = qybz;
    }

    public Integer getGyBh() {
        return gyBh;
    }

    public void setGyBh(Integer gyBh) {
        this.gyBh = gyBh;
    }

    public Timestamp getSb1() {
        return sb1;
    }

    public void setSb1(Timestamp sb1) {
        this.sb1 = sb1;
    }

    public Timestamp getSb2() {
        return sb2;
    }

    public void setSb2(Timestamp sb2) {
        this.sb2 = sb2;
    }

    public Timestamp getSb3() {
        return sb3;
    }

    public void setSb3(Timestamp sb3) {
        this.sb3 = sb3;
    }

    public Timestamp getSb4() {
        return sb4;
    }

    public void setSb4(Timestamp sb4) {
        this.sb4 = sb4;
    }

    public Timestamp getSb5() {
        return sb5;
    }

    public void setSb5(Timestamp sb5) {
        this.sb5 = sb5;
    }

    public Timestamp getSb6() {
        return sb6;
    }

    public void setSb6(Timestamp sb6) {
        this.sb6 = sb6;
    }

    public Timestamp getSb7() {
        return sb7;
    }

    public void setSb7(Timestamp sb7) {
        this.sb7 = sb7;
    }

    public Timestamp getSb8() {
        return sb8;
    }

    public void setSb8(Timestamp sb8) {
        this.sb8 = sb8;
    }

    public Timestamp getSb9() {
        return sb9;
    }

    public void setSb9(Timestamp sb9) {
        this.sb9 = sb9;
    }

    public Timestamp getSb10() {
        return sb10;
    }

    public void setSb10(Timestamp sb10) {
        this.sb10 = sb10;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GkDlcdzd gkDlcdzd = (GkDlcdzd) o;
        return zdBh == gkDlcdzd.zdBh &&
                Objects.equals(zdMc, gkDlcdzd.zdMc) &&
                Objects.equals(cjdBh, gkDlcdzd.cjdBh) &&
                Objects.equals(zdLx, gkDlcdzd.zdLx) &&
                Objects.equals(zdDz, gkDlcdzd.zdDz) &&
                Objects.equals(yhm, gkDlcdzd.yhm) &&
                Objects.equals(mm, gkDlcdzd.mm) &&
                Objects.equals(sccjBh, gkDlcdzd.sccjBh) &&
                Objects.equals(xhBh, gkDlcdzd.xhBh) &&
                Objects.equals(ccRl, gkDlcdzd.ccRl) &&
                Objects.equals(zt, gkDlcdzd.zt) &&
                Objects.equals(qybz, gkDlcdzd.qybz) &&
                Objects.equals(gyBh, gkDlcdzd.gyBh) &&
                Objects.equals(sb1, gkDlcdzd.sb1) &&
                Objects.equals(sb2, gkDlcdzd.sb2) &&
                Objects.equals(sb3, gkDlcdzd.sb3) &&
                Objects.equals(sb4, gkDlcdzd.sb4) &&
                Objects.equals(sb5, gkDlcdzd.sb5) &&
                Objects.equals(sb6, gkDlcdzd.sb6) &&
                Objects.equals(sb7, gkDlcdzd.sb7) &&
                Objects.equals(sb8, gkDlcdzd.sb8) &&
                Objects.equals(sb9, gkDlcdzd.sb9) &&
                Objects.equals(sb10, gkDlcdzd.sb10);
    }

    @Override
    public int hashCode() {
        return Objects.hash(zdBh, zdMc, cjdBh, zdLx, zdDz, yhm, mm, sccjBh, xhBh, ccRl, zt, qybz, gyBh, sb1, sb2, sb3, sb4, sb5, sb6, sb7, sb8, sb9, sb10);
    }
}

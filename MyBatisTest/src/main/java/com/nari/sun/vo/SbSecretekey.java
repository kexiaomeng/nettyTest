package com.nari.sun.vo;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

/**
 * 数据表SB_SECRETEKEY
 * @author kexia
 *
 */
@Getter
@Setter

public class SbSecretekey {
	
    private String zddz;
    private BigDecimal issecrete;
    private String secretekey;

//    public String getZddz() {
//        return zddz;
//    }
//
//    public void setZddz(String zddz) {
//        this.zddz = zddz;
//    }
//
//    public BigDecimal getIssecrete() {
//        return issecrete;
//    }
//
//    public void setIssecrete(BigDecimal issecrete) {
//        this.issecrete = issecrete;
//    }
//
//    public String getSecretekey() {
//        return secretekey;
//    }
//
//    public void setSecretekey(String secretekey) {
//        this.secretekey = secretekey;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SbSecretekey that = (SbSecretekey) o;
        return Objects.equals(zddz, that.zddz) &&
                Objects.equals(issecrete, that.issecrete) &&
                Objects.equals(secretekey, that.secretekey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(zddz, issecrete, secretekey);
    }
    
    @Override
    public String toString() {
    	return zddz;
    }
}

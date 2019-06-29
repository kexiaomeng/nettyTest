package com.nari.sun.mybatis;

import com.nari.sun.vo.SbSecretekey;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface SbDao {
    @Select("select * from Sb_SECRETEKEY WHERE ZDDZ=#{zddz}")
    public SbSecretekey getSbSecretekeyByZddz(String zddz) ;

    public List<SbSecretekey> getAll() ;

    public void insertSb(SbSecretekey sb);

    public void update(SbSecretekey sb);

    public void batchUpdate(@Param(value = "list") List<SbSecretekey> sbSecretekeys);

    public void selectById(List<String> lsit);

}

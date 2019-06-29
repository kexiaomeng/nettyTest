package com.example.demo.mybatis.dao;


import com.example.demo.mybatis.SbSecretekey;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface IDaoMapper {
    @Insert("insert into sb_secretekey (zddz,isSecrete,secretekey) values(#{zddz},#{isSecrete},#{secreteKey}) ")
    int add(SbSecretekey sbSecretekey);
    @Delete("delete from sb_secretekey where zddz = #{zddz}")
    void delete(String zddz);

}

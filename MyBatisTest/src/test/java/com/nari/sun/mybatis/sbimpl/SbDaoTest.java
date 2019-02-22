package com.nari.sun.mybatis.sbimpl;

import com.nari.sun.mybatis.SbDao;
import com.nari.sun.mybatis.sbimpl.SbDaoImpl;
import com.nari.sun.vo.SbSecretekey;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SbDaoTest {

    SqlSession sqlSession;
    SbDao sbDao;
    @org.junit.Before
    public void setUp() throws Exception {


        String file = "mybatis-config.xml";

        try {
            InputStream stream = Resources.getResourceAsStream(file);
            SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(stream);
             this.sqlSession = sessionFactory.openSession();

        } catch (IOException e) {
            e.printStackTrace();
        }

        sbDao = sqlSession.getMapper(SbDao.class) ;
    }

    @org.junit.Test
    public void getSbSecretekeyByZddz() {
        System.out.println(this.sbDao.getSbSecretekeyByZddz("1111"));
    }

    @org.junit.Test
    public void getAll() {

        List<SbSecretekey> sbSecretekeys = this.sbDao.getAll();
        for (SbSecretekey sbSecretekey : sbSecretekeys) {
            System.out.println(sbSecretekey);
        }
    }

    @org.junit.Test
    public void insertSb() {
        SbSecretekey sbSecretekey = new SbSecretekey();
        sbSecretekey.setIssecrete(new BigDecimal(0));
        sbSecretekey.setSecretekey("dfdfdfd");
        sbSecretekey.setZddz("gggg");
        this.sbDao.insertSb(sbSecretekey);
        this.sqlSession.commit();
    }


    @Test
    public void update() {
        SbSecretekey sbSecretekey = new SbSecretekey();
        sbSecretekey.setZddz("1111");
        sbSecretekey.setSecretekey("bbbbbb");
        sbSecretekey.setIssecrete(new BigDecimal(1));

        this.sbDao.update(sbSecretekey);
        this.sqlSession.commit();
    }

    @Test
    public void batchUpdate() {
        SbSecretekey sbSecretekey = new SbSecretekey();
        sbSecretekey.setZddz("1111");
        sbSecretekey.setSecretekey("bbbbbb");
        sbSecretekey.setIssecrete(new BigDecimal(1));


        SbSecretekey tt = new SbSecretekey();
        tt.setZddz("1123");
        tt.setSecretekey("gffhfh");
        tt.setIssecrete(new BigDecimal(0));


        List<SbSecretekey> sbSecretekeys = new ArrayList<>();

        sbSecretekeys.add(tt);
        sbSecretekeys.add(sbSecretekey);
//
        for (SbSecretekey sb : sbSecretekeys) {
            System.out.println(sb);
            System.out.println(sb.getSecretekey());
            System.out.println(sb.getIssecrete());


        }
        this.sbDao.batchUpdate(sbSecretekeys);
        this.sqlSession.commit();

    }
}
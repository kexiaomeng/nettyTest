package com.nari.sun.mybatis;

import com.nari.sun.vo.SbSecretekey;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class SbDaoSpringTest {

    @Autowired
    SbDao sbDao;

    @org.junit.Before
    public void setUp() throws Exception {



    }

    @Test
    public void getSbSecretekeyByZddz() {
        System.out.println(this.sbDao.getSbSecretekeyByZddz("1111"));
    }

    @Test
    public void getAll() {

        List<SbSecretekey> sbSecretekeys = this.sbDao.getAll();
        for (SbSecretekey sbSecretekey : sbSecretekeys) {
            System.out.println(sbSecretekey);
        }
    }

    @Test
    public void insertSb() {
        SbSecretekey sbSecretekey = new SbSecretekey();
        sbSecretekey.setIssecrete(new BigDecimal(0));
        sbSecretekey.setSecretekey("dfdfdfd");
        sbSecretekey.setZddz("gggg");
        this.sbDao.insertSb(sbSecretekey);
    }


    @Test
    public void update() {
        SbSecretekey sbSecretekey = new SbSecretekey();
        sbSecretekey.setZddz("1111");
        sbSecretekey.setSecretekey("bbbbbb");
        sbSecretekey.setIssecrete(new BigDecimal(1));

        this.sbDao.update(sbSecretekey);
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

    }

    @Test
    public void testArr() {
        String [] arr = {"1111","2222"};
        List<String> str = Arrays.asList(arr);
        this.sbDao.selectById(str);


    }
}
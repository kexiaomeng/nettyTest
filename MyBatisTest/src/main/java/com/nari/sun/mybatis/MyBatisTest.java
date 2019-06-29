package com.nari.sun.mybatis;

import java.io.IOException;
import java.io.InputStream;

import com.nari.sun.vo.SbSecretekey;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Slf4j
public class MyBatisTest {
    private  static Logger logger = (Logger) LoggerFactory.getLogger(MyBatisTest.class);

    public static void main(String args[]) {

        String file = "mybatis-config.xml";

        try {
            InputStream stream = Resources.getResourceAsStream(file);
            SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(stream);
            SqlSession session = sessionFactory.openSession();
            session.getConfiguration().addMapper(SbDao.class); // annatation需要主动添加mapper
            SbDao sbDao = session.getMapper(SbDao.class);
            SbSecretekey sbSecretekey = sbDao.getSbSecretekeyByZddz("11111111");

//            SbSecretekey sbSecretekey = (SbSecretekey)session.selectOne("MyMapper.selectZD","1111");
            logger.debug(sbSecretekey.getSecretekey());
            session.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}

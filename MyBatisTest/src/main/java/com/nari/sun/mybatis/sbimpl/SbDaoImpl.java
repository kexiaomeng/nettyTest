package com.nari.sun.mybatis.sbimpl;

import com.nari.sun.mybatis.SbDao;
import com.nari.sun.vo.SbSecretekey;
import org.apache.ibatis.session.SqlSession;

import java.math.BigDecimal;
import java.util.List;

public class SbDaoImpl implements SbDao {
    SqlSession session;

    public SbDaoImpl(SqlSession sqlSession) {
        this.session = sqlSession;
    }
    @Override
    public SbSecretekey getSbSecretekeyByZddz(String zddz) {
        return this.session.selectOne("SbDaoImpl.selectone",zddz);
    }

    @Override
    public List<SbSecretekey> getAll() {
        return this.session.selectList("SbDaoImpl.selectmany");
    }

    @Override
    public void insertSb(SbSecretekey sb) {
        this.session.insert("SbDaoImpl.insert",sb);
    }

    @Override
    public void update(SbSecretekey sb) {
       this.session.update("SbDaoImpl.update",sb);
    }

    @Override
    public void batchUpdate(List<SbSecretekey> sbSecretekeys) {
        this.session.update("SbDaoImpl.batchupdate",sbSecretekeys);
    }

    @Override
    public void selectById(List<String> lsit) {

    }
}

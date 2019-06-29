package com.example.demo.mybatis.service;

import com.example.demo.mybatis.Iservice;
import com.example.demo.mybatis.SbSecretekey;
import com.example.demo.mybatis.dao.IDaoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IserviceImpl implements Iservice {

    @Autowired
    private IDaoMapper iDaoMapper;
    @Override
    public int add(SbSecretekey sbSecretekey) {
        return iDaoMapper.add(sbSecretekey);
    }

    @Override
    public void delete(String zddz) {
        iDaoMapper.delete(zddz);
    }
}

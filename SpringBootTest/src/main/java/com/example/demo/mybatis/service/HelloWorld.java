package com.example.demo.mybatis.service;

import com.example.demo.mybatis.DataObject;
import com.example.demo.mybatis.Iservice;
import com.example.demo.mybatis.SbSecretekey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

    @Autowired
    private DataObject dataObject;
    @Autowired
    private Iservice iservice;
    @RequestMapping("/sun")
    public DataObject say(){
        System.out.println(dataObject.getNari());
        SbSecretekey sbSecretekey = new SbSecretekey();
        sbSecretekey.setSecrete(false);
        sbSecretekey.setZddz("3333");
        sbSecretekey.setSecreteKey("111111111");
        iservice.add(sbSecretekey);
        return dataObject;
    }

    @RequestMapping("/delete")
    public DataObject delete(){
        SbSecretekey sbSecretekey = new SbSecretekey();
        sbSecretekey.setSecrete(false);
        sbSecretekey.setZddz("3333");
        sbSecretekey.setSecreteKey("111111111");
        iservice.delete("3333");
        return dataObject;
    }
}

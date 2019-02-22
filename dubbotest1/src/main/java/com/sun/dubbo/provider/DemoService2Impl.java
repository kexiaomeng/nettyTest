package com.sun.dubbo.provider;


import com.sun.dubbo.api.DemoService;
import com.sun.dubbo.api.DemoService2;
import org.springframework.stereotype.Service;

@Service("demoService2")
public class DemoService2Impl implements DemoService2 {

    public String getString() {
        return "HHHH222222222";
    }
}
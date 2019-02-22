package com.sun.dubbo.provider;

import com.sun.dubbo.api.DemoService;
import org.springframework.stereotype.Service;

@Service("demoService")
public class DemoServiceImpl implements DemoService {

    public String getString() {
        return "HHHH";
    }
}

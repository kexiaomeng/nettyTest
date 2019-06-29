package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Test implements CommandLineRunner {
    @Autowired
    private AppConfig testJavaConfigBean;
    @Override
    public void run(String... args) throws Exception {

        while (true){
            System.out.println(testJavaConfigBean.javaConfigBean());
            Thread.sleep(10000L);
        }

    }
}

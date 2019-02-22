package com.sun.dubbo.provider;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations = "classpath:dubbo-provider.xml")
public class SpringBoot implements CommandLineRunner {
    public static void main(String args[]) {
        SpringApplication.run(SpringBoot.class,args);
    }

    @Override
    public void run(String... args) throws Exception {
        while(true){

        }
    }
}

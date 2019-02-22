package com.sun.dubbo.consumer;

import com.sun.dubbo.api.DemoService;
import com.sun.dubbo.api.DemoService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

import javax.annotation.Resource;

@SpringBootApplication
@ImportResource(locations = "classpath:dubbo-consumer.xml")
public class Test implements CommandLineRunner {

    @Resource(name = "demoService")
    private DemoService demoService;
    @Resource(name = "demoService2")
    private DemoService2 demoService2;


    public static void main(String[] args)  {
        SpringApplication.run(Test.class, args);
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-consumer.xml");
//        context.start();
//
//        System.out.println("Dubbo provider start...");
//        System.out.println(context.getBean(DemoService.class).getString());
//        try {
//            System.in.read();	// 按任意键退出
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println(demoService.getString());
        System.out.println(demoService2.getString());
    }
}

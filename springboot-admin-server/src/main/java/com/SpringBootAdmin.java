package com;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class SpringBootAdmin implements  CommandLineRunner {


    public static void main(String[] args) {

        SpringApplication.run(SpringBootAdmin.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        log.info("netty for spring boot start");
//        Server server = SpringContextUtil.getBean("server", null);
//        server.bind();
    }
}

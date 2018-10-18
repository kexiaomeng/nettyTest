package com.sun.nari.springbootnetty;

import com.sun.nari.springbootnetty.com.sun.nari.springbootnetty.server.Server;
import com.sun.nari.springbootnetty.com.sun.nari.springbootnetty.util.SpringContextUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class SpringbootnettyApplication implements  CommandLineRunner {

    public static void main(String[] args) {

        SpringApplication.run(SpringbootnettyApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("netty for spring boot start");
//        Server server = SpringContextUtil.getBean("server", null);
//        server.bind();
    }
}

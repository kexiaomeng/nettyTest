package com.sun.nari.springbootnetty;

import com.sun.nari.springbootnetty.server.Server;
import com.sun.nari.springbootnetty.util.SpringContextUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


//@Component
//@Slf4j
//public class NettyListenr implements ApplicationListener<ContextRefreshedEvent> {
//
//    @Override
//    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
//        Server server = SpringContextUtil.getBean("server",null);
//        server.bind();
//
//    }
//}



//
//@Component
//@Slf4j
//public class NettyListenr implements CommandLineRunner {
//
//
//    @Override
//    public void run(String... args) throws Exception {
//        Server server = SpringContextUtil.getBean("server",null);
//        server.bind();
//    }
//}

package com.sun.nari.springbootnetty;

import com.sun.nari.springbootnetty.server.Server;
import com.sun.nari.springbootnetty.util.SpringContextUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;


@Component
@Slf4j
public class NettyListenr implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        Server server = SpringContextUtil.getBean("server",null);
        server.bind();

    }
}

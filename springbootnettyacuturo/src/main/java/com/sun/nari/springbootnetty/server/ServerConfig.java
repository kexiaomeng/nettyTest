package com.sun.nari.springbootnetty.server;


import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Getter
@Component
@Configuration
//@PropertySource("classpath:nettyserve.properties")
public class ServerConfig {

    @Value("${netty}")
    private int port=9016;

}

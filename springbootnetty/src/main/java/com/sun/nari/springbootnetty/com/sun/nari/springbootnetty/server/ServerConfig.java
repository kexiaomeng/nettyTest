package com.sun.nari.springbootnetty.com.sun.nari.springbootnetty.server;


import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Getter
@Component
public class ServerConfig {

    @Value("${netty.port}")
    private int port;

}

package com.sun.nari.springbootnetty.com.sun.nari.springbootnetty.server;


import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Getter
@Component
@PropertySource("nettyserve.properties")
public class ServerConfig {

    @Value("${port}")
    private int port;

}

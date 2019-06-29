package com.sun.nari.springbootnetty.server;


import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Getter
@Component
@Configuration
@PropertySource("nettyserve.properties")
public class ServerConfig {

    @Value("${port}")
    private int port;

}

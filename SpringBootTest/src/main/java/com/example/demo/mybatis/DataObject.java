package com.example.demo.mybatis;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "com.sun")
@PropertySource(value = "classpath:application.properties")
public class DataObject {
//    @Value("${com.sun.nari}")
    private String nari;
//    @Value("${com.sun.ali}")
    private String ali;



}

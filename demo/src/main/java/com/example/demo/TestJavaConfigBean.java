package com.example.demo;


import lombok.Data;
import org.springframework.beans.factory.annotation.Value;

@Data
public class TestJavaConfigBean {

    @Value("${ZfNw13Port:10}")
    private String timeout;
}

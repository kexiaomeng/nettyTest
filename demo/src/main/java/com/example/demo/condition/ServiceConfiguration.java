package com.example.demo.condition;


import com.example.demo.condition.dirservice.IListService;
import com.example.demo.condition.dirservice.LInuxListdir;
import com.example.demo.condition.dirservice.WindowsListdir;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfiguration {
    @Bean
    @Conditional(LinuxCondition.class)
    public IListService linuxListdir() {
        return new LInuxListdir();
    }


    @Bean
    @Conditional(WindowsCondition.class)
    public IListService windowsListdir() {
        return new WindowsListdir();
    }



}

package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Slf4j
public class AspectTest {
    @Pointcut("execution(* com.example.demo.mybatis..*.*(..))")
    public void cut1() {

    }

    @Before(value = "cut1()")
    public void before() {
        log.error("dddddddddddddddddddddddddd");
    }

    @After(value = "cut1()")
    public void after() {
        log.error("eeeeeeeeeeeeeeeeeeeeeeeee");
    }
}

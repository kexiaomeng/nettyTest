package com.example.demo.condition;

import com.example.demo.condition.dirservice.IListService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class TestCondition {
    public static void main(String args[]) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(ServiceConfiguration.class);

        IListService service = annotationConfigApplicationContext.getBean(IListService.class);

        log.error(annotationConfigApplicationContext.getEnvironment().getProperty("os.name"));
        service.printdir();
    }

}

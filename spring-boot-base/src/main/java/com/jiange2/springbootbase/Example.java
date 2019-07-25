package com.jiange2.springbootbase;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class Example {

    public static void main(String[] args){
        new AnnotationConfigApplicationContext();
        SpringApplication.run(Example.class);
    }
}

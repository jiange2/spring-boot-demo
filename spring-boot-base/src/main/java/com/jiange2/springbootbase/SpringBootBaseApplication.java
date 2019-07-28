package com.jiange2.springbootbase;

import com.jiange2.springbootbase.controller.DemoController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootBaseApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringBootBaseApplication.class, args);
    }

}

package com.jiange2.springbootbase.config;

import com.jiange2.springbootbase.config.service.Service1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(Configuration2.class)
public class Configuration1 {

    public static void main(String[] args){
        ApplicationContext context =
                new AnnotationConfigApplicationContext(Configuration1.class);
        System.out.println(context.getBean(Service1.class));
    }
}

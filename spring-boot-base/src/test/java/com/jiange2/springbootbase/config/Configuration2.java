package com.jiange2.springbootbase.config;

import com.jiange2.springbootbase.config.service.Service1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configuration2 {

    @Bean
    public Service1 service1(){
        return new Service1();
    }
}

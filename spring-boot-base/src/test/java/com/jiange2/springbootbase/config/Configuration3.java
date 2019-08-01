package com.jiange2.springbootbase.config;

import org.junit.Test;
import org.springframework.boot.env.YamlPropertySourceLoader;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.ClassPathResource;

import javax.annotation.PostConstruct;
import java.io.IOException;
import java.util.List;

@Configuration
public class Configuration3 {

    @Test
    public void test() throws IOException {
        YamlPropertySourceLoader propertySourceLoader
                = new YamlPropertySourceLoader();
        List<PropertySource<?>> propertySources = propertySourceLoader.load("test",
                new ClassPathResource("application.yml"));
        System.out.println(
                propertySources.get(0).getProperty("server.port")
        );
    }
}

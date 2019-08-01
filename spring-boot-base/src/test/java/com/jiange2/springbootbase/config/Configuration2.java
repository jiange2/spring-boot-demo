package com.jiange2.springbootbase.config;

import com.jiange2.springbootbase.config.service.Service1;
import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.connector.Connector;
import org.apache.catalina.startup.Tomcat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Configuration2 {

    public static void main(String[] args) throws LifecycleException {
        Tomcat tomcat = new Tomcat();
        tomcat.setHostname("localhost");
        tomcat.setBaseDir(".");

        Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
        connector.setPort(8080);

        tomcat.getService().addConnector(connector);
        Context context = tomcat.addContext("/app",null);

        Tomcat.addServlet(context, "testServlet",new Configuration1.TestServlet());
        context.addServletMappingDecoded("/test","testServlet");

        tomcat.start();
        tomcat.getServer().await();
    }

    @Bean
    public Service1 service1(){
        return new Service1();
    }
}

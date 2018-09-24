package com.example.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.thymeleaf.ThymeleafAutoConfiguration;
import org.springframework.context.ApplicationListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.sql.DataSource;

@SpringBootApplication
@PropertySource("classpath:application.properties")
public class ServerApplication {
    static Logger logger= LoggerFactory.getLogger("server application");
    public static void main(String[] args) {
        System.out.println("Spring boot run start");
        SpringApplication.run(ServerApplication.class, args);
    }
}

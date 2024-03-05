package com.example.springbootrest;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootrestApplication {

    public static void main(String[] args) {

        ApplicationContext context = (ApplicationContext) SpringApplication.run(SpringbootrestApplication.class, args);
    }

}

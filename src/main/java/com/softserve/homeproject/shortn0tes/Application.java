package com.softserve.homeproject.shortn0tes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = "com.softserve.homeproject.controller")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}




package com.shri.camel.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.shri.camel")
public class RestApisCamelApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestApisCamelApplication.class, args);
    }

}

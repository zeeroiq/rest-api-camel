package com.shri.camel.rest;

import com.shri.camel.rest.util.annotations.IgnoreDuringScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import static org.springframework.context.annotation.ComponentScan.*;

@SpringBootApplication(scanBasePackages = "com.shri.camel")
@ComponentScan(excludeFilters = @Filter( IgnoreDuringScan.class   ))
//@ComponentScan(
//        excludeFilters = {
//                @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = UserConsumerRoute.class)
//        },
//        includeFilters = {
//                @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE, value = FileConsumerRoute.class)
//        })
public class RestApisCamelApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestApisCamelApplication.class, args);
    }

}

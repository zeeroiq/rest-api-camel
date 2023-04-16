/*
 * Created By zeeroiq on 4/17/23, 12:10 AM.
 * Copyright (c) ZeeroIQ
 */

package com.shri.camel.rest;

import com.shri.camel.rest.util.annotations.IgnoreDuringScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@SpringBootApplication
@ComponentScan(basePackages = "com.shri.camel",
        excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION, classes = {IgnoreDuringScan.class})}
)
public class RestApisCamelApplication {

    public static void main(String[] args) {
        SpringApplication.run(RestApisCamelApplication.class, args);
    }

}

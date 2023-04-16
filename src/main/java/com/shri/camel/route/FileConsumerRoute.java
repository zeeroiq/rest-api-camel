package com.shri.camel.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class FileConsumerRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("file:classpath:resources/input")
                .log("${body}")
                .to("file:classpath:resources/output");
    }
}

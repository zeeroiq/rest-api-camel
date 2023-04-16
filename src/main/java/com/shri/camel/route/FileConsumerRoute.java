/*
 * Created By zeeroiq on 4/17/23, 12:10 AM.
 * Copyright (c) ZeeroIQ
 */

package com.shri.camel.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class FileConsumerRoute extends RouteBuilder {

    @Override
    public void configure() {
        from("file:D:/Java/rest-apis-camel/src/main/resources/input")
                .log("${body}")
                .log(">>>>>> test message post body")
                .to("file:D:/Java/rest-apis-camel/src/main/resources/output/");
    }
}

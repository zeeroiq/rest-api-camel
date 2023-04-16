/*
 * Created By zeeroiq on 4/17/23, 12:10 AM.
 * Copyright (c) ZeeroIQ
 */

package com.shri.camel.route;

import com.shri.camel.rest.api.component.DemoComponentBeans;
import com.shri.camel.rest.api.component.SimpleLoggingProcessingComponent;
import com.shri.camel.rest.util.annotations.IgnoreDuringScan;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@IgnoreDuringScan
@Slf4j
@RequiredArgsConstructor
@Component
public class UserConsumerRoute extends RouteBuilder {

    private final DemoComponentBeans demoComponentBeans;
    private final SimpleLoggingProcessingComponent loggingProcessingComponent;

    @Override
    public void configure() {
        // timer
        // transformation
        // log
        // Exchange [ExchangePattern: InOnly, BodyType: null, Body: [Body is null]]
        from("timer:timer-test")
                .log("${body}")
                // transform message body
                .transform().constant("transformation is performed with this")
                .log("${body}")
                .bean(demoComponentBeans)
                .log("${body}")

                // processing message body
                .bean(loggingProcessingComponent)
                .log("${body}")
                .process(loggingProcessingComponent)
                .log("log post process ${body}")
                .to("log:first-timer-test");
    }
}

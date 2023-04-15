package com.shri.camel.route;

import lombok.extern.slf4j.Slf4j;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Slf4j
@Component
public class UserConsumerRoute extends RouteBuilder {

    @Override
    public void configure() {
        // timer
        // transformation
        // log
        // Exchange [ExchangePattern: InOnly, BodyType: null, Body: [Body is null]]
        from("timer: timer-test")
                .transform()
                .constant("Time is now : " + LocalDateTime.now())
                .to("log: first-timer-test");
    }
}

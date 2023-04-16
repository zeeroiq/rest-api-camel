package com.shri.camel.route;

import com.shri.camel.rest.api.component.DemoComponentBeans;
import com.shri.camel.rest.api.component.SimpleLoggingProcessingComponent;
import lombok.RequiredArgsConstructor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Component
public class FileConsumerRoute extends RouteBuilder {
    private final DemoComponentBeans demoComponentBeans;
    private final SimpleLoggingProcessingComponent loggingProcessingComponent;
    @Override
    public void configure() {
        from("file:D:/Java/rest-apis-camel/src/main/resources/input")
                .log("${body}")
                .to("file:D:/Java/rest-apis-camel/src/main/resources/output/");
    }
}

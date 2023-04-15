package com.shri.camel.rest.api.component;

import lombok.extern.slf4j.Slf4j;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class SimpleLoggingProcessingComponent implements Processor {


    @Override
    public void process(Exchange exchange) {
        log.info("SimpleLoggingProcessingComponent : " + exchange.getMessage().getBody());
    }
}

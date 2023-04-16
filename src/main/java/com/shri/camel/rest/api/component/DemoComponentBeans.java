/***********************************************************************************************************************************************************
 ** Created By zeeroiq on 4/17/23, 12:07 AM.
 ** Copyright (c) ZeeroIQ
 *********************************************************************************************************************************************************/

package com.shri.camel.rest.api.component;

import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class DemoComponentBeans {

    public String getCurrentTime() {
        return "DemoComponentBeans: Current time is : " + LocalDateTime.now();
    }
}

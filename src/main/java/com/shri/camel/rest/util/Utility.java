/*
 * Created By zeeroiq on 4/17/23, 12:10 AM.
 * Copyright (c) ZeeroIQ
 */

package com.shri.camel.rest.util;

import com.shri.camel.rest.api.model.User;
import org.springframework.beans.BeanWrapperImpl;

import java.beans.FeatureDescriptor;
import java.util.stream.Stream;

public class Utility {


    public static String[] listOfNullProperties(User user) {
        BeanWrapperImpl wrapper = new BeanWrapperImpl(user);
        return Stream.of(wrapper.getPropertyDescriptors())
                .map(FeatureDescriptor::getName)
                .filter(propertyName -> wrapper.getPropertyDescriptor(propertyName) == null)
                .toArray(String[]::new);
    }
}

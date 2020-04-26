package com.inflack.test.scheduler.model;

import org.springframework.stereotype.Component;

/**
 * @author Tanvir Hossain
 * @since 2020-04-24 16:22
 */

@Component
public class SchedulerIdentifier {

    private String identifier;

    public String get() {
        return identifier;
    }

    public void set(String identifier){
        this.identifier = identifier;
    }
}

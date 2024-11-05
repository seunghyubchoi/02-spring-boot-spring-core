package com.luv2code.springcoredemo.common;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

    public CricketCoach() {
        System.out.println("In constructor : " + getClass().getName());
    }

    // define our init method
    @PostConstruct
    public void doMyStartup() {
        System.out.println("In postConstruct : " + getClass().getSimpleName());
    }

    // define our destroy method
    @PreDestroy
    public void doMyCleanup() {
        System.out.println("In preDestroy : " + getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes :-)";
    }

}

package com.luv2code.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class baseballCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes in batting practice!";
    }
}

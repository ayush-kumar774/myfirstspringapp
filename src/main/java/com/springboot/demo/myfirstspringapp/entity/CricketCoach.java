package com.springboot.demo.myfirstspringapp.entity;

import com.springboot.demo.myfirstspringapp.common.Coach;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {
    public CricketCoach() {
        System.out.println("In constructor " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }
}

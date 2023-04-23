package com.springboot.demo.myfirstspringapp.entity;

import com.springboot.demo.myfirstspringapp.common.Coach;

public class SwimCoach implements Coach {
    public SwimCoach() {
        System.out.println("In constructor " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Swim 1000 meters as a warm up";
    }
}

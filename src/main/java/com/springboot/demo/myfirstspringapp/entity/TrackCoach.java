package com.springboot.demo.myfirstspringapp.entity;

import com.springboot.demo.myfirstspringapp.common.Coach;
import org.springframework.stereotype.Component;

@Component
//@Lazy
//@Primary
public class TrackCoach implements Coach {
    public TrackCoach(){
        System.out.println("In constructor " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Run hard 5 KM" ;
    }
}

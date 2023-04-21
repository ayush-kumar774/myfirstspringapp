package com.springboot.demo.myfirstspringapp.entity;

import com.springboot.demo.myfirstspringapp.common.Coach;
import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BaseballCoach implements Coach {
    public BaseballCoach() {
        System.out.println("In constructor " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes in batting practice." ;
    }
}

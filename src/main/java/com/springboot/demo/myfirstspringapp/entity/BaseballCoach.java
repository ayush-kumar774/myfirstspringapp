package com.springboot.demo.myfirstspringapp.entity;

import com.springboot.demo.myfirstspringapp.common.Coach;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BaseballCoach implements Coach {
    public BaseballCoach() {
        System.out.println("In constructor " + getClass().getSimpleName());
    }

    //define our init method
//    @PostConstruct
//    public void doStartUpStuff() {
//        System.out.println("Connecting to the databases.");
//        System.out.println("In doMyStartupStuff " + getClass().getSimpleName());
//    }

    // define our destroy method
//    @PreDestroy
//    public void doCleanUpStuff() {
//        System.out.println("Disconnecting to the databases.");
//        System.out.println("In doMyCleanUpStuff " + getClass().getSimpleName());
//    }
    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes in batting practice." ;
    }
}

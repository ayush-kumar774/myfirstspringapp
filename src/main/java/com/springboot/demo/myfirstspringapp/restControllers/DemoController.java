package com.springboot.demo.myfirstspringapp.restControllers;

import com.springboot.demo.myfirstspringapp.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    //defining a private field for the dependency
    private Coach myCoach ;
//    private Coach anotherCoach ;

    // defining a constructor for dependency injection (constructor injection)
    @Autowired
    public DemoController(
            @Qualifier("swimCoach") Coach theCoach
//            @Qualifier("baseballCoach") Coach theAnotherCoach
    ) {
        System.out.println("In constructor " + getClass().getSimpleName());
        myCoach = theCoach ;
//        anotherCoach = theAnotherCoach;
    }

//    @Autowired
//    public void setCoach (Coach theCoach) {
//        myCoach = theCoach;
//    }

//    @GetMapping("/compare")
//    public String getComparison() {
//        return "Comparing beans : myCoach == anotherCoach, " + String.valueOf((myCoach == anotherCoach));
//    }
    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}

package com.springboot.demo.myfirstspringapp.restControllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomePageRestController {
    // exposing "/" that return "Hello World"

    // inject propertied for coach.name and team.name

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    // exposing a new endpoint for "teaminfo" and "coachname"
    @GetMapping("/teaminfo")
    public String getTeamInfo() {
        return "Coach: " + coachName + ", Team name: " + teamName;
    }

    @GetMapping("/")
    public String sayHello() {
        System.out.println("Hello World from sayHello function ");
        return "Hello World!" ;
    }

    //exposing a new endpoint for workout
    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a hard 5K";
    }

    // exposing a new endpoint for daily fortune
    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "Today is your lucky day!" ;
    }
}


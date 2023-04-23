package com.springboot.demo.myfirstspringapp.config;

import com.springboot.demo.myfirstspringapp.common.Coach;
import com.springboot.demo.myfirstspringapp.entity.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean
    public Coach swimCoach() {
        return new SwimCoach();
    }
}

// Bean use case
// Take existing third-party class and expose as a spring bean
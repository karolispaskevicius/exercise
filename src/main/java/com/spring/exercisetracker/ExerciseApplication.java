package com.spring.exercisetracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// The @SpringBootApplication annotation is equivalent to @Configuration, @EnableAutoConfiguration, and @ComponentScan
// Is defined in a class that has a (main) method.
@SpringBootApplication
public class ExerciseApplication {
    public static void main(String[] args) {
        // Application control is delegated to the static method run of the SpringApplication class
        // specifying the root component of the application. The Spring framework will run the application,
        // i.e. will start the server with default parameters
        SpringApplication.run(ExerciseApplication.class, args);
        System.out.println("Application is active");
    }
}

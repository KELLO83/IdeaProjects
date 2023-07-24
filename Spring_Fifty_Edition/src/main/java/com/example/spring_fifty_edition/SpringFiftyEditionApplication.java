package com.example.spring_fifty_edition;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.spring_fifty_edition.tacos"})
public class SpringFiftyEditionApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringFiftyEditionApplication.class, args);
    }

}

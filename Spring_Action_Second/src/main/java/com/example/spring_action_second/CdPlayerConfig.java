package com.example.spring_action_second;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CdPlayerConfig {
    @Bean
    public CompactDisc Disc(){
        return  new Disc();
    }
    @Bean
    public CdPlayer cdPlayer(){
        return  new CdPlayer(Disc()); // Dependency injection
    }
}

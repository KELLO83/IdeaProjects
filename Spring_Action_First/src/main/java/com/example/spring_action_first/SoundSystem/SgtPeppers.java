package com.example.spring_action_first.SoundSystem;


import com.example.spring_action_first.SoundSystem.CompactDisc;
import org.springframework.stereotype.Component;


@Component("simple") // Component Class Spring 단서 제공
public class SgtPeppers implements CompactDisc { // CompactDisc type
    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";
    public void play(){
        System.out.println("Playing " + title + " by " + artist);
    }
}

package com.example.spring_action_second;

public class Disc implements CompactDisc {
    public   String title = "Testing";

    @Override
    public  void play(){
        System.out.println("DISC PLAY()");
    }

}

package com.example.spring_action_second;

import org.springframework.beans.factory.annotation.Autowired;

public class CdPlayer {
    private CompactDisc disc;
    //@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")

    public CdPlayer(CompactDisc disc){
        this.disc = disc;
        if(disc == null){
            try{

            }
            catch (Exception NullPointerException){
                System.out.println("DISC IS NULL");
            }
        }
    }
    public void play(){

    }
}

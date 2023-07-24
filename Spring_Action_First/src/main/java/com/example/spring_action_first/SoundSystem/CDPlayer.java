package com.example.spring_action_first.SoundSystem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer implements MediaPlayer{
    private CompactDisc disc;
    //@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
    @Autowired(required = false)  // requied = =false : 해당 타입의 빈이 없으면 메소드 호출 안함
    public CDPlayer(CompactDisc disc){
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

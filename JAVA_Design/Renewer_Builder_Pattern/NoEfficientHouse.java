package Renewer_Builder_Pattern;

import java.io.PrintWriter;

public class NoEfficientHouse {
    private  String roof;
    private String wall;
    private  String backYard;
    public  NoEfficientHouse(String roof,String wall){
        this.roof = roof;
        this.wall = wall;

    }

    public  NoEfficientHouse(String roof,String wall,String backYard){
        this.roof = roof;
        this.wall = wall;
        this.backYard = backYard;

    }
    // ... House 부가옵션이 붙을때마다 생성자를 추가해야한다
    // NoEfficientHouse house = new NOEfficientHouse("나무","나무");
    // NoEfficientHouse house = new NoEfficientHouse("나무","나무","backYard");
    // new NoEfficientHouse("Parm1","Parm2" ...... Parm k.. )



}

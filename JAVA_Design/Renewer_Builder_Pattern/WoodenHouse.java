package Renewer_Builder_Pattern;

public class WoodenHouse {
    private String roof;
    private String wall;

    public WoodenHouse(String roof, String wall){
        this.roof = roof;
        this.wall = wall;
    }

    public String getRoof(){
        return  this.roof;
    }
    public String getWall(){
        return this.wall;
    }
}

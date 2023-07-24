package Renewer_Builder_Pattern;

public class ConcreteHouse {
    private String roof;
    private String wall;

    private  String BackYard;

    public ConcreteHouse(String roof, String wall,String backYard){
        this.roof = roof;
        this.wall = wall;
        this.BackYard = backYard;
    }

    public String getRoof(){
        return  this.roof;
    }
    public String getWall(){
        return this.wall;
    }

}

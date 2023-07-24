package Renewer_Builder_Pattern;

public class JavaBeans {
    // Using Getter Setter
    private String roof;
    private  String wall;
    private  String backYard;


    public void setRoof(String roof){
        this.roof = roof;
    }
    public  void setWall(String wall){
        this.wall = wall;
    }

    public void setBackYard(String backYard){
        this.backYard = backYard;
    }
    /*
    House house = new House();
    house.setRoof("나무");
    house.setWall("나무");
    house.setBackYard("backYard");
    */
}

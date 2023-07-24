package Renewer_Builder_Pattern;

public class Director {
    public  void constructConcreteHouse(Builder builder){
        builder.buildRoof();
        builder.buildWall();
        builder.buildbackYard();
    }

    public  void consturctWoodenHouse(Builder builder){
        builder.buildRoof();
        builder.buildWall();
    }
}

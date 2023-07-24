package Renewer_Builder_Pattern;

import com.sun.source.tree.NewArrayTree;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();

        ConcreteHouseBuilder concreteHouseBuilder = new ConcreteHouseBuilder();
        director.constructConcreteHouse(concreteHouseBuilder);


        System.out.println();


        WoodenHouseBuilder woodenHouseBuilder = new WoodenHouseBuilder();
        director.consturctWoodenHouse(woodenHouseBuilder);


    }
}

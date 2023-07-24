package Renewer_Builder_Pattern;

public class WoodenHouseBuilder implements Builder{
    @Override
    public void buildRoof() {
        System.out.println("나무로 지붕을 짓습니다");
    }

    @Override
    public void buildWall() {
        System.out.println("나무로 벽을 짓습니다");
    }

    @Override
    public void buildbackYard() {}

    public  WoodenHouse getResult(){
        return new WoodenHouse("나무","나무");
    }

}

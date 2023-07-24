package My_absFactory_Pattern;

import Builder_Pattern.Car;

public class Main {
    public static void main(String[] args) {

        KorCarFactory korCarFactory = new KorCarFactory();
        korCarFactory.HyundaiCar_build();


        Store store = new Store("Kor");
        store.generated();

    }
}

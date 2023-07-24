package My_absFactory_Pattern.Factory_Pattern;

public class Main {
    public static void main(String[] args) {
        CarFactory cf = new CarFactory();
        Car car = cf.BuildCar("Korea");
        System.out.println(car.toString());
    }
}

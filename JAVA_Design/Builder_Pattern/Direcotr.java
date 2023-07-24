package Builder_Pattern;

public class Direcotr {
    /*Builder제공하는 method들을 정해진 순서들을 정확히 호출할 의무를 가진다 */
    public Car construct(Builder builder) {
        return builder.setEngine("V8")
                .setBody("SUV")
                .setWheels("Big")
                .setColor("Black")
                .build();
    }
    public  Car construct_SportCar(Builder builder) {
        return builder.setEngine("V8")
                .setBody("Sport")
                .setWheels("Small")
                .setColor("Red")
                .build();
    }

}

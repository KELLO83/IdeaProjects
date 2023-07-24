package Builder_Pattern;

public class Main {
    public static void main(String[] args) {
        Car Using_New_Car = new Car("V8", "SUV", "Big", "Black"); // 생성자를 이용하는방법
        Car Using_CarBuilder = new CarBuilder()
                .setEngine("V8")
                .setBody("SUV")
                .setWheels("Big")
                .setColor("Black")
                .build();
        // Method Chain을 사용하면, 코드가 간결해지고, 가독성이 좋아진다.

        Car test = new CarBuilder()
                .setEngine("Test")
                .build();

        System.out.println("생성자를 이용한 객체생성 :" + Using_New_Car);
        System.out.println("CarBuilder 이용한 객체생성 :" + Using_CarBuilder);
        System.out.println("CarBuilder 인자하나만 사용 :" + test);


        Direcotr direcotr = new Direcotr();
        CarBuilder carBuilder = new CarBuilder();
        Car D1 = direcotr.construct(carBuilder);
        Car D2 = direcotr.construct_SportCar(carBuilder);

        System.out.println("Direcotr를 이용한 객체생성 : " + D1);
        System.out.println("Direcotr를 이용한  스포츠카객체생성 : " + D2);


    }

}

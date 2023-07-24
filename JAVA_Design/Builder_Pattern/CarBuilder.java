package Builder_Pattern;

public class CarBuilder implements Builder {
    private String engine;
    private String body;
    private String wheels;
    private String color;
    public Car build() {
        return new Car(engine, body, wheels, color);
        // Car Builder 필드값들을 Car클래스 생성자 인자 사용
    }
    @Override
    public CarBuilder setEngine(String engine) {
        this.engine = engine;
        return this; // method cahin 구현
    }
    @Override
    public CarBuilder setBody(String body) {
        this.body = body;
        return this;
    }

    @Override
    public CarBuilder setWheels(String wheels) {
        this.wheels = wheels;
        return this;
    }
    @Override
    public CarBuilder setColor(String color) {
        this.color = color;
        return this;
    }

}

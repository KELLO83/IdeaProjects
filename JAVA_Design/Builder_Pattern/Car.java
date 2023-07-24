package Builder_Pattern;

public class Car {
    private String engine;
    private String body;
    private String wheels;
    private String color;

    public Car(String engine, String body, String wheels, String color) {
        this.engine = engine;
        this.body = body;
        this.wheels = wheels;
        this.color = color;
    }
    public String getEngine() {
        return engine;
    }
    public String getBody() {
        return body;
    }
    public String getWheels() {
        return wheels;
    }
    public String getColor() {
        return color;
    }
    @Override
    public String toString() {
        return "Car{" + "engine=" + engine + ", body=" + body + ", wheels=" + wheels + ", color=" + color + '}';
    }
}

package Builder_Pattern;

public interface Builder {
    public CarBuilder setEngine(String engine);
    public CarBuilder setBody(String body);
    public CarBuilder setWheels(String wheels);
    public CarBuilder setColor(String color);
}

package My_absFactory_Pattern.Old;

public class JapanCar {
    private String engine;
    private String body;
    private String wheels;
    private String color;

    JapanCar(){
        this.engine = "Japan car engine";
        this.body = "Japan car body";
        this.color = "BLUE";
        this.wheels = "Japan car wheels";
    }

    @Override
    public String toString() {
        return "JapanCar{" + "engine=" + engine + ", body=" + body + ", wheels=" + wheels + ", color=" + color + '}';
    }
}

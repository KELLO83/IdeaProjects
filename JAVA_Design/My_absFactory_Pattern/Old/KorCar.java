package My_absFactory_Pattern.Old;

public class KorCar {
    private String engine;
    private String body;
    private String wheels;
    private String color;


    KorCar(){
        this.engine = "Kor car engine";
        this.body = "Kor car body";
        this.color = "RED";
        this.wheels = "Kor car wheels";
    }

    @Override
    public String toString() {
        return "KORCar{" + "engine=" + engine + ", body=" + body + ", wheels=" + wheels + ", color=" + color + '}';
    }
}

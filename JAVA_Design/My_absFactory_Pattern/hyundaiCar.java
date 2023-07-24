package My_absFactory_Pattern;

public class hyundaiCar {
    private Body body;
    private Engine engine;

    public  void setBody(Body body) {
        this.body = body;
    }
    public  void setEngine(Engine engine) {
        this.engine = engine;
    }
    public void getCarInfo() {
        System.out.println("Body: " + body.getName() + ", Engine: " + engine.getName());
    }
}

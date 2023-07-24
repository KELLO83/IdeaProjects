package My_absFactory_Pattern;

public class KorCarFactory implements CarFactory
{

    @Override
    public Engine createEngine() {
        return new KorEngine();
    }

    @Override
    public Body createBody() {

        return new KorBody();
    }

    public hyundaiCar HyundaiCar_build(){
        System.out.println("Generated HyundaiCar from KorCarFactory");
        hyundaiCar hyundaiCar = new hyundaiCar();
        hyundaiCar.setBody(createBody());
        hyundaiCar.setEngine(createEngine());
        return hyundaiCar;
    }


}

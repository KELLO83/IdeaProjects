package My_absFactory_Pattern.Factory_Pattern;

public class KorCar implements  Car{

    String Engine = "KorEngine";
    String Body = "KorBody";


    @Override
    public void build_car() {
        System.out.println("KorCar is built with " + Engine + " and " + Body);
    }

    @Override
    public String toString() {
        return  "한국산 자동차입니다\n" + "앤진 :" + this.Engine+"\n" + "바디 :" + this.Body;
    }
}

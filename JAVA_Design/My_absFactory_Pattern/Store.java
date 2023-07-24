package My_absFactory_Pattern;

public class Store {
    String select;
    public Store(String select){
        this.select = select;
    }
    public void generated(){
        if(this.select.equals("kor")){
            KorCarFactory korCarFactory = new KorCarFactory();
            korCarFactory.HyundaiCar_build();
        }
    }
}

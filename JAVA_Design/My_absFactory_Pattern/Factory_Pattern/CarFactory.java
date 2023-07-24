package My_absFactory_Pattern.Factory_Pattern;

public class CarFactory {
    KorCar kr = new KorCar();

    public Car BuildCar(String user){
        if(user.equals("Korea")){
            return kr;
        }
        else{
            return null;
        }
    }
}

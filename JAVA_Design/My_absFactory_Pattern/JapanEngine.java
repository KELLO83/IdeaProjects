package My_absFactory_Pattern;

public class JapanEngine implements Engine {
    JapanEngine(){
        System.out.println("JapanEngine Generated");
    }
    public String getName() {
        return "JapanEngine";
    }
}

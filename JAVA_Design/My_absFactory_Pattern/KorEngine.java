package My_absFactory_Pattern;

public class KorEngine implements Engine
{
    private  String Engine_Name ="korEngine";
    KorEngine(){
        System.out.println("KorEngine Generated");
    }
    @Override
    public String getName() {
        return Engine_Name;
    }
}

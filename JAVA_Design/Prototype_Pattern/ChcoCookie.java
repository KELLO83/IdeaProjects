package Prototype_Pattern;

public class ChcoCookie extends  Cookie{ // Prototype 클래스를 상속받는다
    String KaKao = "카카오";
    /* Concreate Prototype */
    public ChcoCookie(String name) {
        super(name);
    }
    @Override
    public Object clone(){
        try{
            Cookie copy = (Cookie)super.clone();
            return copy;
        }
        catch (Exception e){
            e.printStackTrace();
            return  null;
        }
    }
}

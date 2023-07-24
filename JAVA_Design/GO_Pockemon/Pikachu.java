package GO_Pockemon;

public class Pikachu extends Pockemon{
    @Override
    public void name() {
        System.out.println("포켓몬 이름 : Pikachu");
    }
    public  Pikachu(){
        attack = new millionVolt();
        System.out.println("피카츄를 생성합니다");
        this.name();


    }
}

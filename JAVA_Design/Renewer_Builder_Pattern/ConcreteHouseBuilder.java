package Renewer_Builder_Pattern;

public class ConcreteHouseBuilder implements Builder{

    // Builder 클래스를 상속받는 ConcreteHouseBuilder 클래스 선언
    @Override
    public void buildRoof() {
        System.out.println("콘크리트로 지붕을 짓습니다");
    }

    @Override
    public void buildWall() {
        System.out.println("콘크리트로 벽을 짓습니다");
    }

    @Override
    public void buildbackYard() {
        System.out.println("뒷마당을 짓습니다");
    }

    public ConcreteHouse getResult(){
        return new ConcreteHouse("콘크리트","콘크리트","뒷마당");
    } /* 생성자 */
}

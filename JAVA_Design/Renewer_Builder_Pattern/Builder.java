package Renewer_Builder_Pattern;

public interface Builder {

    // Builder class 선언

    /* Roof Wall 은 필수인자 */
    public  void buildRoof();
    public  void buildWall();

    /* 뒷마당 짓기 선택적 인자 */
    public  void buildbackYard();

}

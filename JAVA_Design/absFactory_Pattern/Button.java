package absFactory_Pattern;

public abstract  class Button {
    protected  String caption;

    public  Button(String caption){
        this.caption = caption;

    }
    public  void ClickEvent(){
        System.out.println(caption + "버튼이 클릭되었습니다.");
    }

    abstract  void render();
}

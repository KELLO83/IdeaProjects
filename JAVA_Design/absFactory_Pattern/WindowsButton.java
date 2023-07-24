package absFactory_Pattern;

public class WindowsButton extends Button{
    public WindowsButton(String caption){
        super(caption);
    }

    @Override
    void render(){
        System.out.println("윈도우 버튼을 렌더링합니다." + this.caption);
    }
}

package absFactory_Pattern;

public class WindowsCheckBox extends  CheckBox{
    public  WindowsCheckBox(boolean bChecked){
        super(bChecked);
    }

    @Override
    void render() {
        System.out.println("윈도우 체크박스를 렌더링합니다." + this.bChecked);
    }
}

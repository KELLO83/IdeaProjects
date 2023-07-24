package absFactory_Pattern;

public class WindowsTextEdit extends  TextEdit{
    public WindowsTextEdit(String value){
        super(value);
    }
    @Override
    public void render() {
        System.out.println("윈도우 텍스트 에디터를 렌더링합니다." + this.value);
    }
}

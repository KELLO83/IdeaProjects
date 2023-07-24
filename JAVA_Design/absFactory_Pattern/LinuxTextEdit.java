package absFactory_Pattern;

public class LinuxTextEdit extends TextEdit{
    public LinuxTextEdit(String value){
        super(value);
    }
    @Override
    public void render() {
        System.out.println("리눅스 텍스트 에디터를 렌더링합니다." + this.value);
    }
}

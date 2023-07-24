package absFactory_Pattern;

public class LinuxButton extends Button {

    public LinuxButton(String caption){
        super(caption);
    }

    @Override
    void render() {
        System.out.println("리눅스 버튼을 렌더링합니다." + this.caption);
    }
}

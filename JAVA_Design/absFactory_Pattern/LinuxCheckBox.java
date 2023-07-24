package absFactory_Pattern;

public class LinuxCheckBox extends  CheckBox{
    public  LinuxCheckBox(boolean bChecked){
        super(bChecked);
    }

    @Override
    void render(){
        System.out.println("리눅스 체크박스를 렌더링합니다." + this.bChecked);
    }
}

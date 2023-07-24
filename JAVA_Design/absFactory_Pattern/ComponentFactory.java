package absFactory_Pattern;

public interface ComponentFactory {

    public Button createButton(String caption); // 인자 각 추상컴포넌트에서 필요한 생성자의 인자와 동일하다
    public CheckBox createCheckBox(boolean bChecked);
    public TextEdit createTextEdit(String value);

    // 추상컴포넌트의 타입 객체를 반환하고있다

}

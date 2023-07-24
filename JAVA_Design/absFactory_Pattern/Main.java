package absFactory_Pattern;

public class Main {
    public static void main(String[] args) {
        ComponentFactory factory = new Windosw_Factory();
        Button button = factory.createButton("윈도우 버튼");
        CheckBox checkBox = factory.createCheckBox(true);
        TextEdit textEdit = factory.createTextEdit("윈도우 텍스트 에디터");

        button.render();
        checkBox.render();
        textEdit.render();



    }
}

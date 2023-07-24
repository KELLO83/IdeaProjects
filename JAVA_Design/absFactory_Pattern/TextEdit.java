package absFactory_Pattern;

public abstract  class TextEdit {
    protected String value;

    public TextEdit(String value){
        this.value = value;
        render();
    }

    public  abstract  void render();

}

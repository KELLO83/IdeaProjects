package Prototype_Pattern;

import javax.swing.plaf.PanelUI;

public class Cookie implements Cloneable { // Interface Cloneable
    /*  Prototype class Cookie*/
    private String name;

    public Cookie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException { // clone() 메소드를 오버라이딩한다
        try{
            Cookie copy = (Cookie)super.clone(); // clone() 메소드를 호출한다
            return copy;
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
    @Override
    public String toString() {
        return "Cookie{" +
                "name='" + name + '\'' +
                '}';
    }
}

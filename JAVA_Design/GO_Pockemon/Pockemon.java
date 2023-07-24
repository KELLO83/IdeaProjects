package GO_Pockemon;

public abstract class Pockemon {
    public Attack attack;

    public Pockemon(){}

    abstract public void name();

    public void setAttack(Attack attack){
        this.attack = attack;
    }
}

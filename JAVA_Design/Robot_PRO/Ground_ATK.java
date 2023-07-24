package Robot_PRO;

public class Ground_ATK implements Attack{
    @Override
    public void Groud_Attack(Robot robot) {
        System.out.println("Attack Ground_Attack");
    }

    @Override
    public void Flying_Attack(Robot robot) {
        System.out.println("Attack Flying_Attack");
    }

    @Override
    public void Missile_Attack(Robot robot) {
        System.out.println("Attack Missile_Attack");
    }
}

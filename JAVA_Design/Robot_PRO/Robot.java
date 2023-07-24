package Robot_PRO;



public class Robot {
    private    String name;
    private    Move mv;
    public Attack atk;

    Robot(String atomRobot){
        this.name = "UNKNOWN";
    }
    public  void setState(Attack atk) {
        this.atk = atk;
    }


    public void MV(Move move) {
        this.mv = move;
    }
    public void show(){
        if (mv instanceof Air) {
            System.out.println("공중을 날수있습니다");
        } else if (mv instanceof Walk) {
            System.out.println("땅을 걷습니다");
        } else {
            System.out.println(mv.toString());
        }
        if(atk instanceof Missile_Attack){
            System.out.println("Attack Missile_Attack");
        } else if (atk instanceof  Ground_ATK) {
            System.out.println("Attack Ground_Attack");
        } else if (atk instanceof  Flying_ATK) {
            System.out.println("Attack Flying_Attack");
        }
        else {
            System.out.println(atk.toString());
        }


        System.out.println();
    }
    public  void Air(){System.out.println("공중을 날수있습니다");}

    public  void Ground(){System.out.println("로봇이 걷습니다");}


}

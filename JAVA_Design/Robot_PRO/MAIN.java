package Robot_PRO;

public class MAIN {
    public static void main(String[] args) {
        ATOM_Robot AR = new ATOM_Robot();
        Flying_ATK FAT = new Flying_ATK();
        Air fly = new Air();
        AR.setState(FAT);
        AR.MV(fly);
        AR.show();


        TaekwonV Tv= new TaekwonV();
        Ground_ATK GAT = new Ground_ATK();
        Walk WK = new Walk();
        Tv.setState(GAT);
        Tv.MV(WK);
        Tv.show();


        Sungard SG = new Sungard();
        Missile_Attack MAT = new Missile_Attack();
        SG.setState(MAT);
        SG.MV(WK);
        SG.show();




    }


}

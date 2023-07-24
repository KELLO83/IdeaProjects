package Prototype_Pattern;


public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Cookie tempCookie = null;
        ChcoCookie prot = new ChcoCookie("초코맛 쿠키");
        CookieMachine cm = new CookieMachine(prot); //  CookieMachine

        for(int i = 0 ;i<3 ; i++){
            tempCookie = cm.makeCookie(); // 쿠키 기계에서 쿠키를 복제한다
            tempCookie.setName(i+"번째 쿠키");
            System.out.printf("%s 쿠기 %o해시주소",tempCookie,tempCookie.hashCode());
            System.out.println();

        }
        ChcoCookie tempChcoCookie = null;
        Cookie prot2 = new ChcoCookie("초코 쿠키");
        CookieMachine cm2 = new CookieMachine(prot2);

        for(int i=0 ; i<3 ; i++){
            tempChcoCookie = (ChcoCookie) cm2.makeCookie();
            tempChcoCookie.setName(i+"번째 초코 쿠키");
            System.out.printf("%s 쿠기 %o해시주소",tempChcoCookie,tempChcoCookie.hashCode());
            System.out.println();
        }

    }
}

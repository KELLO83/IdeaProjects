package My_absFactory_Pattern.Old;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("어느 나라 자동차를 만들까요??");
        String country = scan.nextLine();

        if (country.equals("korea")) {
             KorCar car = new KorCar();
             System.out.println(car);
        }
        else if (country.equals("Japan")) {
            JapanCar car = new JapanCar();
            System.out.println(car);

        }




    }
}

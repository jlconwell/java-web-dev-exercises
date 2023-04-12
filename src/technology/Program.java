package technology;

import java.sql.SQLOutput;

public class Program {

    public static void main(String[] args) {

        Laptop hpVictus = new Laptop("Victus", "3080ti", 8, true, true);

        System.out.println(hpVictus.toString());

        hpVictus.changeNumPadToFalse();

        System.out.println(hpVictus.toString());

        SmartPhone googlePixel7 = new SmartPhone("Google Pixel 7", "Unknown", 8, false, 6.3);

        System.out.println(googlePixel7.toString());

        hpVictus.addRam(16);
        System.out.println(hpVictus.toString());


    }


}

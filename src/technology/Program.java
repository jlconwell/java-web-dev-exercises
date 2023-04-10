package technology;

import java.sql.SQLOutput;

public class Program {

    public static void main(String[] args) {

        Computer dell = new Computer("HP", "Hoopty", "January 1, 1939", "Desktop");

        System.out.println(dell.toString());

        Laptop hpVictus = new Laptop("HP", "Victus", "Laptop", "Janaury 1, 1939", "Gaming");

        System.out.println(hpVictus.toString());

//
    }
}

package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius for Circle: ");
        String radiusString = input.nextLine();

        if (radiusString.isEmpty() || radiusString.matches(".*[a-z].*")) {
            System.out.println("Error: No value or number was entered.  Program exiting.");
//            System.out.println("Enter radius for Circle:");
//            radiusString = input.nextLine();
            System.exit(0);
        }


        Double radius = Double.parseDouble(radiusString);
//
        while (radius <= 0) {
            System.out.println("Error:  Negative numbers not allowed");
            System.out.println("Enter radius for Circle:");
            radius = input.nextDouble();
        }

        input.close();

        System.out.println(Circle.getArea(radius));
    }
}

package exercises;
import java.util.Scanner;
public class MilesPerGallon {
    public static void main(String[] args) {
        double miles;
        double gallons;
        double milesPerGallon;

        Scanner input = new Scanner(System.in);
        System.out.println("How many miles did you drive?");
        miles = input.nextDouble();

        System.out.println("How many gallons of gas did you use?");
        gallons = input.nextDouble();

        milesPerGallon = miles / gallons;

        System.out.println("Your miles per gallon of gas is " + milesPerGallon);
    }
}

package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        double miles;
        double fuel;
        double milesPerGallon;

        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven: ");
        miles = input.nextDouble();

        System.out.println("How many gallons of fuel have you used: ");
        fuel = input.nextDouble();
        input.close();

        milesPerGallon = (miles / fuel);
        System.out.println("You're car achieves " + milesPerGallon + " miles per gallon.");
        System.out.println("You drove " + miles + " miles and consumed " + fuel + " gallons of fuel.");
    }
}

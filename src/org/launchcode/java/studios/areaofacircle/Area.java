package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        double pi = 3.14;
        double radius;
        double area;

        Scanner input = new Scanner(System.in);


        while (true) {
            System.out.println("What is the radius of the circle: ");
            radius = input.nextDouble();

            if (radius <= 0) {
                System.out.println("Negative number ERROR, please enter a positive number.");
//            } else if () {
//                System.out.println("Non-number character ERROR, please enter a positive number.");
            } else {
                area = Circle.getArea(radius);
                System.out.println("The area of this circle is " + area);
                System.out.println("This was calculated with the radius input of " + radius);
                input.close();
                break;
            }
        }
    }
}

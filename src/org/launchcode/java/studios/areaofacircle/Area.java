package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        Double radius = input.nextDouble();


        if(radius < 0){
            System.err.println("Be more positive.");
            System.exit(0);
        }

        input.close();

        Double area = Circle.getArea(radius);

        System.out.printf("The area of a circle with radius %s is: %s", radius, area);

    }
}

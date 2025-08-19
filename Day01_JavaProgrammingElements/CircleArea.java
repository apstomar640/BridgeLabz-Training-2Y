//Write a program to calculate the area of a circle using Area = π * radius^2.

import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //taking radius input
        System.out.print("Enter radius of the circle: ");
        double radius = sc.nextDouble();

        //calculating area
        double area = Math.PI * radius * radius;

        //printing result
        System.out.println("The area of the circle with radius " + radius + " is " + area);
    }
}

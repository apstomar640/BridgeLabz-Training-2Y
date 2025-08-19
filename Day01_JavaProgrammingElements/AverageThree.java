//Write a program to calculate average of 3 numbers.

import java.util.Scanner;

public class AverageThree {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //taking three numbers
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        System.out.print("Enter third number: ");
        double num3 = sc.nextDouble();

        //calculating average
        double average = (num1 + num2 + num3) / 3;

        //printing result
        System.out.println("The average of the three numbers is " + average);
    }
}

//Write a program that takes two numbers as input from the user and prints their sum.

import java.util.Scanner;

public class AddTwoNumbers {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //taking first number
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        //taking second number
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        //calculating sum
        int sum = num1 + num2;

        //printing result
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
    }
}

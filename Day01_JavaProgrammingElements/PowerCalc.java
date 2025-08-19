//Write a program that takes base and exponent and prints base^exponent.

import java.util.Scanner;

public class PowerCalc {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //taking base
        System.out.print("Enter base number: ");
        double base = sc.nextDouble();

        //taking exponent
        System.out.print("Enter exponent: ");
        double exponent = sc.nextDouble();

        //calculating power
        double result = Math.pow(base, exponent);

        //printing result
        System.out.println(base + " raised to the power " + exponent + " is " + result);
    }
}

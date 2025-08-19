//Write a program to calculate Simple Interest using formula (P*R*T)/100.

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //taking principal
        System.out.print("Enter Principal: ");
        double principal = sc.nextDouble();

        //taking rate
        System.out.print("Enter Rate of Interest: ");
        double rate = sc.nextDouble();

        //taking time
        System.out.print("Enter Time (in years): ");
        double time = sc.nextDouble();

        //calculating simple interest
        double si = (principal * rate * time) / 100;

        //printing result
        System.out.println("The Simple Interest is " + si);
    }
}

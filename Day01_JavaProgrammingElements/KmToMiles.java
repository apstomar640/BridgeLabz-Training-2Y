//Write a program to convert distance in kilometers to miles using Miles = km * 0.621371.

import java.util.Scanner;

public class KmToMiles {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //taking distance in kilometers
        System.out.print("Enter distance in kilometers: ");
        double km = sc.nextDouble();

        //converting to miles
        double miles = km * 0.621371;

        //printing result
        System.out.println(km + " kilometers in miles is " + miles);
    }
}

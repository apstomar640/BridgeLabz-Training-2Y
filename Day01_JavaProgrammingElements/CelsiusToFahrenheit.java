//Write a program that takes the temperature in Celsius as input and converts it to Fahrenheit.

import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //taking Celsius input
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();

        //converting to Fahrenheit
        double fahrenheit = (celsius * 9/5) + 32;

        //printing result
        System.out.println(celsius + "°C in Fahrenheit is " + fahrenheit + "°F");
    }
}

//Write a program to calculate the volume of a cylinder using Volume = π * radius^2 * height.

import java.util.Scanner;

public class CylinderVolume {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //taking radius
        System.out.print("Enter radius of the cylinder: ");
        double radius = sc.nextDouble();

        //taking height
        System.out.print("Enter height of the cylinder: ");
        double height = sc.nextDouble();

        //calculating volume
        double volume = Math.PI * radius * radius * height;

        //printing result
        System.out.println("The volume of the cylinder is " + volume);
    }
}

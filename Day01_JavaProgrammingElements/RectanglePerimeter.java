//Write a program to calculate the perimeter of a rectangle using Perimeter = 2*(length + width).

import java.util.Scanner;

public class RectanglePerimeter {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //taking length
        System.out.print("Enter length of the rectangle: ");
        double length = sc.nextDouble();

        //taking width
        System.out.print("Enter width of the rectangle: ");
        double width = sc.nextDouble();

        //calculating perimeter
        double perimeter = 2 * (length + width);

        //printing result
        System.out.println("The perimeter of the rectangle is " + perimeter);
    }
}

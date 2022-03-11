package ch2InputOutput;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the radius of circle: ");
        float radius=input.nextFloat();
        double pi=Math.PI;
        double area=pi*(radius*radius);
        double circumference=2*(pi*radius);
        double diameter=2*radius;
        System.out.printf("Area of circle is: %f%n",area);
        System.out.printf("Diameter of circle is: %f%n",diameter);
        System.out.printf("Circumference of circle is: %f%n",circumference);
    }
}

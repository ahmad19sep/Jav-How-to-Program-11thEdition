package ch6methods;

import java.util.Scanner;

public class Hypotenuse {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the two sides of the triangle");
        System.out.print("Side1: ");
        double side1=input.nextDouble();
        System.out.print("Side2: ");
        double side2=input.nextDouble();
        System.out.printf("%s%10s%10s%n%.2f%15.2f%15.2f","Side1","side2","Hypotenuse"
                ,side1,side2,hypotenuse(side1,side2));
    }
    public static double hypotenuse(double side1,double side2){
        return (Math.sqrt((Math.pow(side1,2))+(Math.pow(side2,2))));



    }
}

package ch2InputOutput;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        System.out.print("Enter your Height in Inches: ");
        double height=input.nextDouble();
        System.out.print("Enter your Weight in Ponds: ");
        double weight=input.nextDouble();
        double BMI=(weight*703)/(height*height);
        System.out.printf("Your is BMI= %.3f%n",BMI);
        System.out.println("*********************************************************");
        System.out.println("BMI Categories:");
        System.out.println("Under Weight =<18.5");
        System.out.println("Normal Weight = 18.5-24.9");
        System.out.println("Over Weight = 25-29.9");
        System.out.println("Obestiy = BMI of 30 or greater");

    }
}

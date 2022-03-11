package ch2InputOutput;

import java.util.Scanner;

public class SmlLrgNum {
    //Developer Name: Ahmad Siddique
    // Date: 11-March-2022
    // Time: 16:02pm

    // purpose
    // Square two numbers by taking input from user

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int num1 = input.nextInt();
        System.out.print("Enter 2nd Number: ");
        int num2 = input.nextInt();
        System.out.print("Enter 3rd Number: ");
        int num3 = input.nextInt();
        int sum = num1 + num2 + num3;
        System.out.printf("Sum: %d%n", sum);
        int product = num2 * num1 * num3;
        System.out.printf("Product: %d%n", product);
        int avg = sum / 3;
        System.out.printf("Avg: %d%n", avg);
        if (num1 < num2 && num1 < num3) {
            System.out.printf("Num: %d%n is the smalllest number", num1);
        }
        if (num1 > num2 && num1 > num3) {
            System.out.printf("Num: %d%n is the Largest  number", num1);
        }
        if (num2 > num1 && num2 > num3) {
            System.out.printf("Num: %d is the Largest  number %n", num2);
        }
        if (num2 < num1 && num2 < num3) {
            System.out.printf("Num: %d is the Smallest  number %n", num2);
        }
        if (num3 < num1 && num3 < num2) {
            System.out.printf("Num: %d is the Smallest  number %n", num3);
        }
        if (num3 > num1 && num3 > num2) {
            System.out.printf("Num: %d is the Largest  number %n", num3);
        }


    }
}

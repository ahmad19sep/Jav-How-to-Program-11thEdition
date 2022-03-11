package ch2InputOutput;

import java.util.Scanner;

public class IfStatement {
    //Developer Name: Ahmad Siddique
    // Date: 11-March-2022
    // Time: 08:18am

    // purpose
    // decision making program

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Take first integer
        System.out.print("Enter First Number: ");
        int num1 = input.nextInt();
        //Take second integer
        System.out.print("Enter Second Integer: ");
        int num2 = input.nextInt();
        //Checking the conditions

        if (num1 == num2) {
            System.out.printf("%d = %d%n", num1, num2);
        }
        if (num1 != num2) {
            System.out.printf("%d != %d%n", num1, num2);
        }
        if (num1 > num2) {
            System.out.printf("%d > %d%n", num1, num2);
        }
        if (num1 < num2) {
            System.out.printf("%d < %d%n", num1, num2);
        }


    }

}

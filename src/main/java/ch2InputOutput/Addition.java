package ch2InputOutput;

import java.util.Scanner;

public class Addition {

    //Developer Name: Ahmad Siddique
    // Date: 10-March-2022
    // Time: 10:12pm

    // purpose
    // Add two numbers by taking input from user

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Take first integer

        System.out.print("Enter First Number: ");
        int number1 = input.nextInt();

        //Take Second number
        System.out.print("Enter Second Number: ");
        int number2 = input.nextInt();

        //sum of two numbers
        int sum = number1 + number2;

        //output

        System.out.printf("Sum is: %d%n", sum);

    }
}

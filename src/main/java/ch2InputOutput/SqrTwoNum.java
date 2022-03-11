package ch2InputOutput;

import java.util.Scanner;

public class SqrTwoNum {
    //Developer Name: Ahmad Siddique
    // Date: 11-March-2022
    // Time: 16:02pm

    // purpose
    // Square two numbers by taking input from user

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int num1=input.nextInt();
        System.out.print("Enter 2nd Number: ");
        int num2=input.nextInt();
        int sqrNum1=num1*num1;
        System.out.printf("Sqr First num: %d%n",sqrNum1);
        int sqrNum2=num2*num2;
        System.out.printf("Sqr First num: %d%n",sqrNum2);
        int total=sqrNum1+sqrNum2;
        System.out.printf("Total : %d%n",total);
        int difference=sqrNum1-sqrNum2;
        System.out.printf("Difference Between Two Numbers : %d%n",difference);






    }
}

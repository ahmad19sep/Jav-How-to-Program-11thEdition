package ch2InputOutput;

import java.util.Scanner;

public class CompareNum {
    //Developer Name: Ahmad Siddique
    // Date: 11-March-2022
    // Time: 16:02pm

    // purpose
    // compare number
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int num1=input.nextInt();
        int sqrNum1=num1*num1+num1;
        if(sqrNum1 > 100){
            System.out.printf("Num:  %d greater than 100",sqrNum1);
        }
        if(sqrNum1 < 100){
            System.out.printf("Num:  %d less than 100",sqrNum1);
        }
        if(sqrNum1 == 100){
            System.out.printf("Num:  %d equal to ",sqrNum1);
        }
    }
}

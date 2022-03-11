package ch2InputOutput;

import java.util.Scanner;

public class Divisible {
    //Developer Name: Ahmad Siddique
    // Date: 11-March-2022
    // Time: 17:02pm

    // purpose
    // Divisible by three

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int num1 = input.nextInt();
        int divisible=num1%3;
        if(divisible==0){
            System.out.printf("Num: %d is divisible by 3",num1);
        }
        if(divisible!=0){
            System.out.printf("Num: %d is  not divisible by 3",num1);
        }
  }

}

package ch6methods;

import java.util.Scanner;

public class Divisible5 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter your number: ");
        System.out.println(isMultiple(input.nextInt()));

    }
    public static boolean isMultiple(int num){
        return num%5==0;
    }
}

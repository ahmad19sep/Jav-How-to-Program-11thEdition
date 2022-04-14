package ch6methods;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        while (true){
            System.out.print("Enter the pair of integers: ");
            int num1=input.nextInt();
            int num2=input.nextInt();

            System.out.println(isMultiple(num1,num2)+" Pair");
            System.out.println("Press 'S' to stop function");

            if (input.next().charAt(0)=='s'){
                break;
            }
        }
    }
    public static boolean isMultiple(int num1, int num2){
        return num1 % num2 == 0;
    }
}

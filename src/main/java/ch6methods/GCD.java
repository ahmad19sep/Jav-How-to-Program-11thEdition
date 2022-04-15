package ch6methods;

import java.util.Scanner;

// ch6
// 6.27 GCD
public class GCD {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter your numbers ");
        int number1=input.nextInt();
        int number2=input.nextInt();
        gcd(number1,number2);
    }
    public static void gcd(int num,int num2) {
        int smallest = Math.min(num,num2);
        for (int i=smallest/2; i>=1; i--){
            if(num%i==0 && num2 %i==0){
                System.out.println("GCD IS "+i);
                break;
            }
        }
    }
}

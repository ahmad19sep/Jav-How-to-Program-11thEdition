package ch6methods;

import java.util.Scanner;

//ch 6
// question 6.24 perfect numbers
public class perfectNu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your number: ");
        perfectNum(input.nextInt());
    }

    public static void perfectNum(int num) {

        int perfectNum = 0;
        for (int i = num - 1; i >= 1; i--) {
            if (num % i == 0) {
                perfectNum += i;
            }
        }
        if (perfectNum == num) {
            System.out.println("Your number is perfect");
        } else
            System.out.println("Your number is not perfect");

    }
}

package ch4;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int count = 1;
        int palindrome = 0;
        int number = 0;
        int numberChecker = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Number in five digits: ");
        int inputNo = scanner.nextInt();
        number = inputNo;
        numberChecker = number;
        scanner.nextLine();
        for (int i = 0; i < 5; i++) {
            int rem = inputNo % 10;
            int div = inputNo / 10;
            inputNo = div;
            if (div != 0) {

                count++;

            }

        }
        if (count != 5) {
            System.out.println("Enter valid number ");
        } else {
            for (int i = 1; i <= count; i++) {
                int reminder = number % 10;
                palindrome = (palindrome * 10) + reminder;
                number = number / 10;

            }

            if (palindrome == numberChecker) {
                System.out.println("Your number is palindrome");
                System.out.println("NUmber" + palindrome);
            } else {
                System.out.println("Your NUmber is not Palindrome");
                System.out.println("Number" + palindrome);
            }
        }
    }
}

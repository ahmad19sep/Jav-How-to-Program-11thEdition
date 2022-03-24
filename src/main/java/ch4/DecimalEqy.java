package ch4;

import java.util.Scanner;

public class DecimalEqy {
    public static void main(String[] args) {
        int decimal = 0;

        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter binary Number: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        while (number > 0) {
            int rem = number % 10;
            number = number / 10;
            int base=1;
            for (int i = 1; i <= count; i++) {
                base *= 2;
            }
decimal+=rem*base;
            count++;
        }
            System.out.println(decimal);
        }
    }


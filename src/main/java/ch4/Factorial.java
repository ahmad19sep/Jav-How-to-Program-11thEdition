package ch4;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        double factorial = 1;
        double constantE = 1;
        Scanner scanner = new Scanner(System.in);
      /*  System.out.print("Enter number : ");
        int number = scanner.nextInt();
        scanner.nextLine();
        if (number > 0) {
            for (int i = number; i >= 1; i--) {
                factorial *= i;

            }
            System.out.println("Factorial : " + factorial);*/

        System.out.print("Enter terms to calculate the value of 'e': ");
        int term = scanner.nextInt();
        for (int i = 1; i <= term; i++){
            factorial=1;
            for (int j = i; j >= 1; j--) {

                factorial *=j;


            }    constantE +=   (1 /factorial);
        }
        System.out.printf("e =%.2f",constantE);
    }
    }


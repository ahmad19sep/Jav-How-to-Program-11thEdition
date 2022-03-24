package ch4;

import java.util.Scanner;

public class Tax {
    public static void main(String[] args) {
        char ch = 's';
        Scanner scanner = new Scanner(System.in);
        while (ch != 'e') {
            System.out.print("Enter Citizen Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Earnings: ");
            int earning = scanner.nextInt();
            scanner.nextLine();
            if (earning > 30000) {
                double totalTax = (double) earning * 20 / 100;
                System.out.printf("Total Tax Payed by the %s = %.2f%n", name, totalTax);
                System.out.println("Calculate another Citizen Tax press 'a' or 'e' to stop the program");
                ch = scanner.next().charAt(0);
            }
            if (earning <= 30000) {
                double totalTax = (double) earning * 15 / 100;
                System.out.printf("Total Tax Payed by the %s = %.2f%n", name, totalTax);
                System.out.println("Calculate another Citizen Tax press 'a' or 'e' to stop the program");
                ch = scanner.next().charAt(0);
            }

        }
    }
}

package ch15Files;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class BankInquiry {
    static Scanner input = new Scanner(System.in);
    // Getting choice like Credit balance
    private final static MenuOption[] choices = MenuOption.values();

    public static void main(String[] args) {
        MenuOption accountType = getRequest(input);
        while (accountType != MenuOption.END) {
            switch (accountType) {
                case CREDIT_BALANCE:
                    System.out.println("\nCredit Balance\n");
                    break;
                case DEBIT_BALANCE:
                    System.out.println("\nDebit Balance\n");
                    break;
                case ZERO_BALANCE:
                    System.out.println("\nZero Balance\n");
                    break;
            }
            readRecord(accountType);
            accountType = getRequest(input);
        }
    }

    private static MenuOption getRequest(Scanner input) {
        System.out.printf("%s%n%s%n%s%n",
                "1 for zero Balance",
                "2 for credit balance",
                "3 for Debit balance",
                "4 for end");
        int request = 0;
        try {
            do {
                System.out.print("request: ");
               request = input.nextInt();
            }
            while (request < 1 || request > 4);

        } catch (InputMismatchException e) {
            System.err.println(e.getMessage());
        }
        return choices[3 - 1];
    }

    private static void readRecord(MenuOption acc) {
        try {
            Scanner scanner = new Scanner(Paths.get("Clients.txt"));
            while (scanner.hasNext()) {
                int ac = scanner.nextInt();
                String FirstName = scanner.next();
                String lastName = scanner.next();
                double balance = scanner.nextDouble();
                if (shouldDisplay(acc, balance)) {
                    System.out.printf("%-4d\t%s\t%s\t%.2f%n"
                            , ac, FirstName, lastName, balance);
                } else {
                    scanner.nextLine();
                }
            }
        } catch (NoSuchElementException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.exit(1);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static boolean shouldDisplay(MenuOption ac, double balance) {
        if (ac == MenuOption.CREDIT_BALANCE && balance < 0) {
            return true;
        } else if (ac == MenuOption.DEBIT_BALANCE && balance > 0) {
            return true;
        } else return ac == MenuOption.ZERO_BALANCE && balance == 0;
    }
}
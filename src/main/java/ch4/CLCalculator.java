package ch4;

import java.util.Scanner;

public class CLCalculator {
    public static void main(String[] args) {
        char ch = 's';
        Scanner scanner = new Scanner(System.in);
        while (ch != 'e') {
            System.out.print("Enter Customer Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Customer Account Number: ");
            String accountNo = scanner.nextLine();
            System.out.print("Enter Account Balance Starting of Month: ");
            int startingBalance = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter amount charged in this month: ");
            int charges = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter credit applied in this month: ");
            int credits = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter Credit Limit: ");
            int limit = scanner.nextInt();
            int newBalance=(startingBalance+charges-credits);
            System.out.printf("New Balance = %d%n",newBalance);
            if(newBalance  > limit){
                System.out.println("Credit Limit Exceeded");
            }
            System.out.println("Close the program press 'e' or any ket to continue ");
            ch=scanner.next().charAt(0);

        }
    }
}

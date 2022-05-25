package ch8ClassesAndObjects;


import java.util.Scanner;

public class SavingsTest {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        SavingAccountClass saver1 = new SavingAccountClass(2000);
        SavingAccountClass saver2 = new SavingAccountClass(3000);
        System.out.print("Enter Annual Interest Rate: ");
        SavingAccountClass.setAnnulInterestRate(scanner.nextInt());
        for (int i = 0; i < 12; i++) {
            System.out.print("*******************Customer 1**************");

            System.out.println("\t\t\t******************Customer 2*****************");

            System.out.print("Interest Rate of " + (i + 1) + " month: ");
            System.out.print(saver1.calculateMonthlyInterest());

            System.out.print("\t\t\tInterest Rate of " + (i + 1) + " month: ");
            System.out.println(saver2.calculateMonthlyInterest());


            saver1.setSavingsAccount(saver1.calculateMonthlyInterest());
            saver2.setSavingsAccount(saver2.calculateMonthlyInterest());
            System.out.println();
            System.out.print("New Balance is : " + saver1.getSavingsAccount());
            System.out.println("\t\t\tNew Balance is : " + saver2.getSavingsAccount());
            System.out.println();
        }
    }

}

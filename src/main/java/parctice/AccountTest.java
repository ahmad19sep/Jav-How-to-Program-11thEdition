package parctice;

import java.util.Scanner;

public class AccountTest {
    public static void main (String [] args){
        Account account1=new Account("null",30);
        Scanner input=new Scanner(System.in);

        System.out.print("Enter your Name: ");
        String userName=input.nextLine();
        account1.setName(userName);
        System.out.print("Enter deposit Balance: ");
        account1.depositBalance(input.nextDouble());
        System.out.printf("Name : %s%n%s\t= $%.2f",account1.getName(),"Total Balance",account1.getBalance());
    }
}

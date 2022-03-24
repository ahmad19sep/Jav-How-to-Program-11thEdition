package ch4;

import java.util.Scanner;

public class SalesCommission {
    public static void main(String[] args) {
        int totalItems = 0;
        int totalValue = 0;
        char ch = 's';
        Scanner scanner=new Scanner(System.in);
while (ch!='e'){
    System.out.print("Enter Item No: ");
    int itemNo=scanner.nextInt();
    scanner.nextLine();
    totalItems++;
    System.out.print("Enter Item Value: ");
    int value=scanner.nextInt();
    totalValue +=value;
    scanner.nextLine();
    System.out.print("Press 'e' to calculate the earning of the sale Men or 'a' to add more items: ");
    ch=scanner.next().charAt(0);

}
int totalEarning=(totalValue*9)/100+200;
        System.out.printf("%S = %d%n","Total earning of the salemen",totalEarning);
    }
}

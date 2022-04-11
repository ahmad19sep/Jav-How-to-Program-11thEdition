package ch5Switch;

import java.util.Scanner;

public class TaxPlan {
    public static void main(String[] args) {
    int totalMoney=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter product Name and price \n*when you want to calculate tax press ctrl+d ");


        while (input.hasNext()){

            String name= input.nextLine();

            totalMoney+=input.nextInt();
            input.nextLine();
        }
        int totalTax=(totalMoney*23/100);
        System.out.printf("%s\t%d$","Total tax you pay",totalTax);
    }
}

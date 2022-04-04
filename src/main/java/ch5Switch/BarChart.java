package ch5Switch;

import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int num=0;

        for(int i=1; i<=5; i++){
            System.out.print("Enter "+i+" Number: ");
            int value=scanner.nextInt();
            num*=10;
            num+=value;
        }
        for (int i=1;i<=5; i++){
            int star=num%10;
            num/=10;
            System.out.println("Num :"+star);
            for (int j=1; j<=star; j++){

                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

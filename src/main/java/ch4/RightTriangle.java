package ch4;

import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the value of the Base: ");
        int base= scanner.nextInt();
        if(base >=1 && base <=10){
            for (int i=1; i<=base; i++){
                System.out.println("");
                for (int j=1; j<=base; j++){

                    if(j==1 || i==base || j==i){
                        System.out.print("*");
                    }
                    else System.out.print(" ");

                }
            }
        }
        else
        System.out.println("Enter valid input");
    }
}

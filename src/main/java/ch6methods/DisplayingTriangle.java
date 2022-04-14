package ch6methods;

import java.util.Scanner;

public class DisplayingTriangle {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the length of the star: ");
        star(input.nextInt());

    }
    public static void star(int length){
        for (int i=1; i<=length; i++){
            System.out.println("");
            for (int j=1; j<=length; j++){
                if(j<=i){
                    System.out.print(j);
                }
                else
                    System.out.print(" ");
            }
        }
    }
}

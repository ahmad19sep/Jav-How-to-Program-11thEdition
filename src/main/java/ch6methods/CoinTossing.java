package ch6methods;

import java.security.SecureRandom;
import java.util.Scanner;
public class CoinTossing {
    static SecureRandom randomNum= new SecureRandom();
    static int head=0;
    static int tail=0;

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.print("Toss the coin press '1' or '0' to stop the program: ");
            if (scanner.nextInt()==1){
                flip();
            }
            else break;
        }
        System.out.println("Head appears "+head+" times");
        System.out.println("Tail appears "+tail+" times");
    }
    public static void flip(){
        int num=randomNum.nextInt(2);
        if (num==1){
            System.out.println("Head");
            head++;
        }
        else
        {
            System.out.println("Tail");
            tail++;
        }
    }
}

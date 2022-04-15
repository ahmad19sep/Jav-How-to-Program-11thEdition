package ch6methods;

import java.util.Scanner;

//ch 6
// 6.25 prime nu
public class PrimeNum {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter your number: ");
        prime(input.nextInt());
    }
    public static void prime(int num){

        for (int i=1; i<=num; i++){
            if (i<=2){
                continue;
            }
            int count=0;
        for(int j=i/2; j>=2; j--){
            if(i%j==0){
              //  System.out.println("Your number "+i+" is not PM");
                ++count;
                break;
            }


        }if (count==0){
                System.out.println( i+" is a prime number");
            }


    }}

}

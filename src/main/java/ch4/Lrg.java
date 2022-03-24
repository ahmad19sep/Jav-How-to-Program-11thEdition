package ch4;

import java.util.Scanner;

public class Lrg {
    public static void main(String[] args) {
        int largestNumber=0;
        int frequentNo=0;
        Scanner scanner=new Scanner(System.in);
        int count=1;
        while (count<=10){
            System.out.print("Enter "+count+" number: ");
            int number=scanner.nextInt();
            if(largestNumber < number ){
                largestNumber=number;
            }
            count++;
        }
        System.out.println("largest Number = "+largestNumber);
    }
}

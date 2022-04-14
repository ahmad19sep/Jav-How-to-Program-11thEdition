package ch6methods;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter the year: ");
        leapYear(input.nextInt());
    }
    public static void leapYear(int year){
        if(year%4==0){
            System.out.println(year+" is leap year");
        }
        else
        System.out.println(year+" is not leap year");
    }
}

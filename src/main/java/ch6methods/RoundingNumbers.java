package ch6methods;

import java.util.Scanner;

public class RoundingNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char flag = 'a';
        while (flag != 's') {
            System.out.print("Enter the number you want to round off: ");
            double x= input.nextDouble();
            double y0=Math.floor(x+0.5);
            double y=Math.floor(x*10+0.5)/10;
            double y1=Math.floor(x*100+0.5)/100;
            double y2=Math.floor(x*1000+0.5)/1000;
            System.out.printf("%-20s\t\t%s%n%.1f\t\t\t\t\t%10.1f%n","Your original number  ","RoundOff Number",x,y0);
            System.out.printf("%-20s\t\t%s%n%.1f\t\t\t\t\t%10.2f%n","Your original number  ","RoundOff Number",x,y);
            System.out.printf("%-20s\t\t%s%n%.1f\t\t\t\t\t%10.3f%n","Your original number  ","RoundOff Number",x,y1);
            System.out.printf("%-20s\t\t%s%n%.1f\t\t\t\t\t%10.4f%n","Your original number  ","RoundOff Number",x,y2);
            System.out.println("to terminate the program press 's' or any key to continue");
            flag=input.next().charAt(0);
        }
    }
}

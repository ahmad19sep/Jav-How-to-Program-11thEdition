package ch6methods;

import java.util.Scanner;

// ch 6
// Question 22 Temperature conversion
public class eConversion {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Select one to enter your temperature");
        System.out.println("Press 1 for:Celsius  &&  2 for :Kelvin");
      if(input.nextInt()==1){
          System.out.print("Enter Temperature in Celsius: ");
          celTem(input.nextInt());
      }
      else
          System.out.println("Enter Temperature in Kelvin");
      kelTem(input.nextInt());
    }
    public static void celTem(int tem){
        System.out.println("Temperature in kelvin is"+(tem+273.15));
    }
    public static void kelTem(int tem){
        System.out.println("Temperature in Celsius is"+(tem-273.15));
    }
}

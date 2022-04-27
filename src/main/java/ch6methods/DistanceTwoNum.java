package ch6methods;

import java.util.Scanner;

//Distance between two numbers
public class DistanceTwoNum {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter x1: ");
        double x1=scanner.nextDouble();
        System.out.print("Enter x2: ");
        double x2=scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1=scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2=scanner.nextDouble();
        distance(x1,x2,y1,y2);
    }
    public static void distance(double x1,double x2, double y1, double y2){
        double distance=Math.sqrt(Math.pow((x2-x1),2)+(Math.pow((y2-y1),2)));
        System.out.printf("%s\t%.2f","Distance between the points is",distance);
    }
}

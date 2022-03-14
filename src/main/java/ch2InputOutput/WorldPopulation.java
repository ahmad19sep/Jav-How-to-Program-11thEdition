package ch2InputOutput;

import java.util.Scanner;

public class WorldPopulation {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //current population 78,000,000,00

        System.out.print("Current World Population:  ");
        double population=input.nextDouble();
        System.out.printf("%s: %.2f%n","Current World Population",population);
        double year1c=(population*1.1)/100;
        double year1=year1c+population;
        System.out.printf("%s: %.2f%n","World Population After 1st Year",year1);
        double year2c=(year1*1.1)/100;
        double year2=year2c+year1;
        System.out.printf("%s: %.2f%n","World Population After 2nd Year",year2);
    }
}

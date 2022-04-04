package ch5Switch;

import java.util.Scanner;

public class Extremes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maximum = 0;
        int minimum = 0;
        int lastMaximum = maximum;
        int counter = 1;
        System.out.print("How many values you want to enter: ");
        int values = scanner.nextInt();
        while (counter <= values) {
            System.out.print("Enter number  " + counter + ": ");
            int value = scanner.nextInt();
            if (counter == 1) {
                minimum = value;
                lastMaximum = value;

            }
            if (value > maximum) {
                lastMaximum = maximum;
                maximum = value;
            }

            if (value < minimum) {
                minimum = value;
            }
            counter++;
        }
        System.out.printf("%-20s%30s%40s%n", "Minimum Number", "Maximum Number", "Sum of two extremes");
        System.out.printf("%-20d%30d%40d", minimum, maximum, lastMaximum + maximum);
    }
}

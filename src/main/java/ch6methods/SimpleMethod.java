package ch6methods;

import java.util.Scanner;

public class SimpleMethod {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        volumeCal();

    }

    public static double volume(double radius, double height) {
        return (1.0 / 3.0 * Math.PI * Math.pow(radius, 2) * height);
    }

    public static void volumeCal() {

        System.out.print("Enter the  radius of the sphere: ");
        double radius = input.nextDouble();
        System.out.print("Enter the height of the sphere: ");
        double height = input.nextDouble();
        System.out.printf("%s\t%.2f%n", "Volume of the sphere is", volume(radius, height));

    }
}

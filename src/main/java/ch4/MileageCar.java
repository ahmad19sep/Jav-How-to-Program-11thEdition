package ch4;

import java.util.Scanner;

public class MileageCar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalGallon = 0;
        int totalMiles = 0;
        int totalTrips = 0;
        char ch = 'a';
        while (ch != 's') {
            System.out.print("Enter Trip No: ");
            int trip = scanner.nextInt();
            scanner.nextLine();
            totalTrips++;
            System.out.print("Enter Total Miles Covered in this trip = ");
            int miles = scanner.nextInt();
            scanner.nextLine();
            totalMiles += miles;
            System.out.print("Enter Total Gallons used in this Trip = ");
            int gallon = scanner.nextInt();
            scanner.nextLine();
            totalGallon += gallon;
            double avgMiles = (double) miles / gallon;
            System.out.println("*****In Trip****** " + trip);
            System.out.printf("%.2f miles covered per gallon%n", avgMiles);
         if(totalTrips > 1) {
             System.out.println("*****Avg of " + totalTrips + " trip ******");
             double totalAvg = (double) totalMiles / totalGallon;
             System.out.printf("%.2f miles per gallon%n", totalAvg);
         }
            System.out.printf("%nBack to the home press 's' or 'a' to add other trip:  ");
            ch = scanner.next().charAt(0);

        }

    }
}

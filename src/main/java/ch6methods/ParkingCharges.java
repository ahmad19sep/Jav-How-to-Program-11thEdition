package ch6methods;

import java.util.Scanner;

public class ParkingCharges {
     static int totalCars=0;
     static  int last24HoursReceipts = 0;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char flag = 's';
        while (flag != 'e') {
            System.out.print("In last 24 hours \n how many hours your car parking in the Garage: ");
totalMoney(input.nextInt());
            System.out.print("\nTO CHECK ANOTHER CAR CHARGES PRESS 'a' \nOTHERWISE PRESS" +
                    "'e' TO STOP THE PROGRAM");
            flag=input.next().charAt(0);

        }
    }

    public static void totalMoney(int hours) {


        int carBill = 0;
        if (hours == 3) {
            last24HoursReceipts += 2;
            carBill = 2;

            ++totalCars;
            System.out.println("Car Number: "+totalCars);
            System.out.printf("%s\t%d$%n", "Total charges of your car is ", carBill);
        } else if (hours > 2 && hours < 24) {

            int additionalHours = (hours - 3);
            carBill = (int) (2 + (additionalHours * 0.50));
            last24HoursReceipts += carBill;

            ++totalCars;
            System.out.println("Car Number: "+totalCars);
            System.out.printf("%s\t%d$%n", "Total charges of your car is ", carBill);
        } else if (hours == 24) {

            carBill = 10;
            last24HoursReceipts += carBill;

            ++totalCars;
            System.out.println("Car Entry Number: "+totalCars);
            System.out.printf("%s\t%d$%n", "Total charges of your car is ", carBill);
        }

        if(totalCars>1) {
            System.out.println("\nLast 24 hours receipts  " + last24HoursReceipts+"$");
        }

    }
}
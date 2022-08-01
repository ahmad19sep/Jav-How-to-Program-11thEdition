package Ch7Arrays.java;

import java.util.Scanner;

public class AirLineSystemEx7 {
    static Scanner scanner = new Scanner(System.in);
    static boolean[] seats;
    static int economySeats;
    static int FirstClass;

    public static void main(String[] args) {
        seats = new boolean[seats()+1];
economySeats=seats.length/2+1;
FirstClass=0;

            for (int i = 0; i < seats.length; i++) { display();
                int num=scanner.nextInt();
                int pessangerDisicion = num;
                if (pessangerDisicion == 1) {


                    firstClass();
                } else if (pessangerDisicion == 2) {

                    economyClass();
                }
                if (i==seats.length){
                    System.out.println("seats are complete Wait for next plane");
                    break;
                }
            }


    }
    public static void display() {
        System.out.printf("%15s%n", "****WELCOME TO PIA PRIVATE INTERNATIONAL AIRLINE****");
        System.out.println("Please type 1 for First class: ");
        System.out.println("Please type 2 for Economy class: ");
    }

    public static int seats() {
        System.out.print("Airline seats: ");
        return scanner.nextInt();
    }

    public static void firstClass() {
       if (FirstClass < seats.length/2){
            seats[FirstClass] = true;
            System.out.println("SEAT NO: "  + (FirstClass+1) + "HAS  RESERVED FOR YOU IN BUSINESS CLASS" +
                    "(: THANK YOU");

        } else {
            System.out.println("First class seat are completely reserved" +
                    " do you want take seat in economy class press yes or no ");
            String pg = scanner.nextLine();
            if (pg.equals("Yes")) {
                economyClass();
            } else if(pg.equals("no")){
                System.out.println("Next flight leaves in 3 hours");
            }
        }
       FirstClass++;
    }

    public static void economyClass() {

        if (economySeats < seats.length) {
            seats[economySeats] = true;
            System.out.println(economySeats);

            System.out.println("SEAT NO: " + economySeats + "HAS BEEN RESERVED FOR IN Economy CLASS" +
                    "(: THANK YOU");
        }
        else {


            System.out.println("Economy class seat are completely reserved" +
                    " do you want take seat in First  class press yes or no ");
            String pg = scanner.nextLine();
            if (pg.equals("Yes")) {
                firstClass();
            } else {
                System.out.println("Next flight leaves in 3 hours");
            }
        }economySeats=economySeats+1;
    }

}



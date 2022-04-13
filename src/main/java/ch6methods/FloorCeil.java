package ch6methods;

import java.util.Scanner;

public class FloorCeil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double value = input.nextDouble();
        System.out.println("for Math.floor");
        System.out.println(Math.floor(value));
        System.out.println(Math.ceil(value));
        if (Math.floor(value) == myFloor(value)) {
            System.out.println("Required value : " + myFloor(value));
            System.out.println("Test is passed");
        } else {
            System.out.println("Test is failed");
            System.out.println("Required value : " + myCeil(value));
        }
        System.out.println("for Math.Ceil");
        if (Math.ceil(value) == myCeil(value)) {

            System.out.println("Test is passed");
            System.out.println("Required value : " + myCeil(value));
        } else {
            System.out.println("Test is failed");
            System.out.println("Required value : " + myCeil(value));
        }
    }

    public static int myFloor(double num) {
        if ( num >1 && num % 1!=0 ) {
            return (int) (num);
        }
        else if (num < 0 && num %1!=0){
            return (int) num-1;
        } else
            return (int) num;
    }


    public static int myCeil(double num) {
        if ( num >=  1 && num % 1!=0 ) {
            return (int) (num+1);
        }
        else if (num < 0 && num %1!=0){
            return (int) (num);
        }
        else
            return (int) num;
    }
}


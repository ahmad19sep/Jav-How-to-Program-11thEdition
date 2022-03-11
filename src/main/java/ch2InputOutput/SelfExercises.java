package ch2InputOutput;

import java.util.Scanner;

public class SelfExercises {
    //Developer Name: Ahmad Siddique
    // Date: 11-March-2022
    // Time: 08:31am

    // Answer sheet CH2  (Self-Review Exercise)

    public static void main(String[] args) {
        //2.3
        // (a).....
        int c = 0;
        int thisIsAVariable = 0;
        int q76354 = 0;
        int number = 0;
        // (a) complete

        // (b)......
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        // (b) complete

        // (c) ......
        System.out.print("Enter any number: ");
        int input1 = input.nextInt();
        // (c) complete

        // (d)......
        System.out.println("This is a java program");
        // (d) end...

        // (e).....
        System.out.printf("%s%n%s%n", "This is a Java", "program");

        // (e) end....

        //(f)...
        System.out.print("Enter a number: ");
        int x = input.nextInt();
        if (x < 0) {
            System.out.println("This number is negative ");
        }
        //(f) end...
        // 2.3 end.................................................

        // 2.4 Identify the error .....
            /* (a)....
            error is (;)

            correct first error
            remove (;)
            (b)........(b)
            error is (>=)
            but true is(=>)
             */

        // 2.5......
        //Marks sheet (calculate total marks in three tests)
        System.out.print("Enter mark of First test: ");
        int t1 = input.nextInt();
        System.out.print("Enter mark of 2nd test: ");
        int t2 = input.nextInt();
        System.out.print("Enter mark of 3rd test: ");
        int t3 = input.nextInt();
        int total = t3 + t2 + t1;
        System.out.printf("%s : %d%n ", "Total marks", total);

        // 2.8...........
        //(a)....enter age
        System.out.println("Enter your Age: ");
        //(a)end...
        //(b)......
        int x1=5;
        int y1=4;
        int z=x1%y1;
        //(b)end....

        //(c)....
        int avgMarks=total/3;
        System.out.printf("Avg Marks: %d",avgMarks);
        //(c)end....


    }

}


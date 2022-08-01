package Ch7Arrays.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ExerciseQuestions {
    //7.8 part a

    public static void main(String[] args) {
        int[] fractions = {1, 4, 67, 4, 3, 6, 7, 7, 4, 7};
        System.out.println("Value of element 9" + fractions[9]);
        //*********************************************************
        //----------------------------------------------------------
        // 7.8 part b

        double[] array = {3.4, 7.8, 6.9, 8.5, 9.1};
        //------------------------------------------------------------
        //************************************************************
        // 7.8 part c
        int sum = 0;
        Integer[] b = {1, 4, 6, 7, 5, 43, 6, 465, 7, 47, 4};
        System.out.println("b " + Arrays.asList(b));
        for (int i : b) {
            sum += i;
        }
        System.out.println("Sum is " + sum);
        //*******************************************************************
        //-------------------------------------------------------------------
        //7.8 part d
        Integer[] array1 = {2, 4, 5, 3, 2,};
        System.out.println("original array" + Arrays.asList(array1));
        reverse(array1);
//------------------------------------------------------------------------------------
        //*************************************************************************
        // 7.8 part e


        int[] element = {2, 4, 5, 6, 7, 5, 3, 32, 5, 6, 3, 6, 3, 6, 32, 5, 6, 3, 543};
        int sum1 = 1;
        for (int i = 3; i < 11; i++) {
            sum1 *= element[i];
        }
        System.out.println("sum1" + sum1);

//****************************************************************************************
        //---------------------------------------------------------------------

        //7.9
        int[][] t = {{1, 2, 3, 3}, {7, 8, 9, 3}};
        System.out.println(t.length); // for rows
        System.out.println(t[0].length * t.length); // for columns
        System.out.println(t[1].length); // for colums
        System.out.println(t[0].length * t.length); // for total elements
        for (int i : t[0]) {
            System.out.println("t[0] " + i);
        }
        for (int[] ints : t) {

            System.out.println(ints[2]);
        }
        t[0][0] = 0;
        t[0][1] = 0;
        t[0][2] = 0;
        t[0][3] = 0;
        t[1][0] = 0;
        t[1][1] = 0;
        t[1][3] = 0;
        t[1][2] = 0;
        for (int[] ints : t) {
            for (int i : ints) {
                System.out.print(i);
            }
            System.out.println();
        }
        Arrays.fill(t[0], 7);
        Arrays.fill(t[1], 73);
        for (int[] ints : t) {
            for (int i : ints) {
                System.out.print(" " + i);
            }
            System.out.println();
        }
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                t[i][j] = 9;
            }
        }

        for (int[] ints : t) {
            System.out.println("0000");
            for (int i : ints) {
                System.out.print(" " + i);
            }
        }
        System.out.println();
        Scanner scanner = new Scanner(System.in);
      /*  for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                System.out.println("Enter the value of t [" + i + "][" + j + "] :");
                t[i][j] = scanner.nextInt();
            }
        }
        for (int[] ints : t) {
            System.out.println("user");
            for (int i : ints) {
                System.out.print(" " + i);
            }
        }*/
        int smallest=t[0][0];
        for (int [] ints : t){
            for (int i : ints){
                if (i < smallest){
                    smallest=i;
                }
            }
        }
        System.out.println("Smallest: "+smallest);
        System.out.printf("%s%n",Arrays.toString(t[0]));
        System.out.println("+"+(Integer.parseInt(String.valueOf(t[0][3]+t[1][3]))));

    }
    static void reverse(Integer[] reverseArray) {
        Collections.reverse(Arrays.asList(reverseArray));
        System.out.println("Reversed Array:" + Arrays.asList(reverseArray));
    }


}

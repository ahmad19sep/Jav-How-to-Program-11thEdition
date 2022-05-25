package Hacker.java;

import java.util.Scanner;

public class D2Determinant {


    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[][] d3=new int[4][4];
        System.out.println("Enter 4 by 4 array");
        for (int i=0; i<4; i++){
            for (int j=0; j<4; j++){
                d3[i][j]=scanner.nextInt();
            }
        }

        System.out.println("Determinant is = " + d4(d3));
    }

    public static int d2(int[][] d2) {
        return (d2[1][1] * d2[0][0]) - (d2[0][1] * d2[1][0]);
    }

    public static int d3(int[][] d3) {
        // index 1********************
        int index1 = d3[0][0];

        int[][] det1 = {
                {d3[1][1], d3[1][2]},
                {d3[2][1], d3[2][2]}
        };
        int determinant1 = d2(det1);
        //******************************************************

        // index2*************************
        int index2 = d3[0][1];
        int[][] det2 = {
                {d3[1][0], d3[1][2]},
                {d3[2][0], d3[2][2]}
        };
        int determinant2 = d2(det2);
//****************************************************
        int index3 = d3[0][2];
        int[][] det3 = {
                {d3[1][0], d3[1][1]},
                {d3[2][0], d3[2][1]}
        };
        int determinant3 = d2(det3);
        //*****************************************************************
        //Determinant of 3 By 3 Arrays

        return ((index1 * determinant1) - (index2 * determinant2)
                + (index3 * determinant3));

    }
    public static int d4(int[][] d4){
//*********************INDEX---------------1*****************
                int index1=d4[0][0];
                int[][] array1 = {
                        {d4[1][1], d4[1][2], d4[1][3]},
                        {d4[2][1], d4[2][2], d4[2][3]},
                        {d4[3][1], d4[3][2], d4[3][3]},
                };
                int determinant1=d3(array1);
//*********************INDEX---------------2*****************
        int index2=d4[0][1];
        int[][] array2 = {
                {d4[1][0], d4[1][2], d4[1][3]},
                {d4[2][0], d4[2][2], d4[2][3]},
                {d4[3][0], d4[3][2], d4[3][3]},
        };
        int determinant2=d3(array2);
//*********************INDEX---------------3*****************
        int index3=d4[0][2];
        int[][] array3 = {
                {d4[1][0], d4[1][1], d4[1][3]},
                {d4[2][0], d4[2][1], d4[2][3]},
                {d4[3][0], d4[3][1], d4[3][3]},
        };
        int determinant3=d3(array3);

        //*********************INDEX---------------4*****************
        int index4=d4[0][3];
        int[][] array4= {
                {d4[1][0], d4[1][1], d4[1][2]},
                {d4[2][0], d4[2][1], d4[2][2]},
                {d4[3][0], d4[3][1], d4[3][2]},
        };
        int determinant4=d3(array4);
        //*********************INDEX---------------end*****************
        return ((index1*determinant1)-(index2*determinant2)+(index3*determinant3)-
                (index4*determinant4));
                }
            }




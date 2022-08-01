package Ch7Arrays.java;

import java.util.Scanner;

public class TwoDMain {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter Total Student in Class: ");
        int students=scanner.nextInt();
        int[][] classData=new int[students][7];
        for (int i=0; i<classData.length; i++){

                System.out.print("Enter "+(i+1)+" student rollNo: ");
                classData[i][0]=scanner.nextInt();
                System.out.print("Enter computer Marks: ");
                classData[i][1]=scanner.nextInt();
                System.out.print("Enter math Marks: ");
                classData[i][2]=scanner.nextInt();
                System.out.print("Enter Physics Marks: ");
                classData[i][3]=scanner.nextInt();
                System.out.print("Enter IST Marks: ");
                classData[i][4]=scanner.nextInt();
                System.out.print("Enter urdu Marks: ");
                classData[i][5]=scanner.nextInt();
                System.out.print("Enter english Marks: ");
                classData[i][6]=scanner.nextInt();
            }
            TWoDimensionalGradeBook class11=new TWoDimensionalGradeBook("Class I-2 ICS",classData);
        System.out.printf("%50s%n",class11.getCourseBook());
        System.out.println("\t\t\t\t\t\t*********************************************\n\n\n");
           class11.gradeProcess();
        }

    }


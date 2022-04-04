package ch5Switch;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        {
            int totalGrades = 0;
            int gradeCounter = 0;
            int gradeA = 0;
            int gradeB = 0;
            int gradeC = 0;
            int gradeD = 0;
            int gradeE = 0;
            Scanner input = new Scanner(System.in);

            System.out.printf("%s%n ",
                    "Enter the integer grades in the range 0-100."
            );

// loop until user enters the end-of-file indicator

            while (input.hasNext()) {
                int grade = input.nextInt(); // read grade
                totalGrades += grade; // add grade to total
                ++gradeCounter; // increment number of grades
                switch (grade / 10) {
                    case 9:
                    case 10:
                        gradeA++;
                        break;
                    case 8:
                        gradeB++;
                        break;
                    case 7:
                        gradeC++;
                        break;
                    case 6:
                        gradeD++;
                        break;
                    default:
                        gradeE++;
                        break;
                }}

                System.out.printf("%nGrade Report%n");
                if (gradeCounter != 0) {
                    double average = (double) totalGrades / gradeCounter;

                    System.out.printf("Total of the %d grades entered is %d%n", gradeCounter, totalGrades);
                    System.out.printf("Average of the %d grades is %.2f%n", totalGrades, average);
                    System.out.println("A grade : " + gradeA);
                    System.out.println("B grade student :" + gradeB);
                    System.out.println("c grade student :" + gradeC);
                    System.out.println("D grade student :" + gradeD);
                    System.out.println("E grade student :" + gradeE);
                }

        }
    }
}

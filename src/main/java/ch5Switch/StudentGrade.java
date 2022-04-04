package ch5Switch;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int gradeA = 0;
        int gradeB = 0;
        int gradeC = 0;
        int gradeD = 0;

        System.out.print("Enter Student Grade: ");
        while (scanner.hasNext()) {

            int grade = scanner.nextInt();
            switch (grade/10) {
                case 9:
                case 10:
                    ++gradeA;
                    break;
                case 7:
                case 8:
                    ++gradeB;
                    break;
                case 6:
                    ++gradeC;
                    break;
                default:
                    ++gradeD;
                    break;
            }
        }
        System.out.printf("%d Students Get A grade%n", gradeA);
        System.out.printf("%d Students Get B grade%n", gradeB);
        System.out.printf("%d Students Get C grade%n", gradeC);
        System.out.printf("%d Students Get D grade%n", gradeD);
    }
}


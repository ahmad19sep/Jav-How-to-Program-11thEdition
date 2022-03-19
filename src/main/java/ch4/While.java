package ch4;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        int counter=1;
        int totalGrades=0;
        Scanner scanner=new Scanner(System.in);
        while (counter  <= 10){
            System.out.print("Enter Grade of"+counter+" Student: " );
            int grade=scanner.nextInt();
            scanner.nextLine();
            totalGrades +=grade;
            counter++;

        }
        System.out.println("Total Students: "+(counter-1));
        System.out.println("Total Grades = "+totalGrades);
        System.out.println("Average Grades of Total Class = "+totalGrades*10/100);
    }
}

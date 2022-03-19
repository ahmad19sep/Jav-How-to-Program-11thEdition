package ch4;

import java.util.Scanner;

public class ifElseTarnry {
    public static void main(String[] args) {
        int counter=1;
        int totalGrades=0;
        int pass=0;
        int fail=0;
        Scanner scanner=new Scanner(System.in);
        while (counter  <= 10){
            System.out.print("Enter Grade of"+counter+" Student: " );
            int grade=scanner.nextInt();
            if(grade > 50 && grade <= 100){
              pass++;
            }
            else if(grade > 0 && grade <= 49){
                fail++;
            }
            scanner.nextLine();
            totalGrades +=grade;
            counter++;

        }

        System.out.println("Total Students: "+(counter-1));
        System.out.printf("No of Fail Students = %d%n",fail);
        System.out.printf("No of Pass Students = %d%n",pass);
        System.out.printf("Total Grades = %d%n",totalGrades);
        System.out.printf("Average Grades of Total Class = %d%n",(totalGrades*10/100));
        System.out.println("******Over All Class Condition*********");
        System.out.println(totalGrades > 800 ? "Class condition: A": "Class Condition Not Good");
    }
}

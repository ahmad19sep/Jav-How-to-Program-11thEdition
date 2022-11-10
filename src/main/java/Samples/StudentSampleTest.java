package Samples;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentSampleTest  {
    static List<StudentSample> students = new ArrayList<>();
   public static List<StudentSample> getList(){
       return students;
   }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("How Much Student you want to Add: ");
        int num = input.nextInt();
        int age = 0;
        String name, id, clas;
        for (int i = 0; i < num; i++) {
            System.out.printf("***** Student Number %d ******%n", i + 1);
            System.out.print("Enter age: ");
            age = input.nextInt();
            System.out.print("Enter name: ");
            name = input.next();

            System.out.print("Enter id: ");
            id = input.next();

            System.out.print("Enter class: ");
            clas = input.next();
            System.out.println();

            students.add(new StudentSample(name, id, age, clas));
        }
        System.out.println(students);
    }
}

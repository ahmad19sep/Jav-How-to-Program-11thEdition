package parctice;
import java.util.Scanner;
public class While {
   public static void main(String [] args){
       int passStudent=0;
       int failStudent=0;
       Scanner input=new Scanner(System.in);
       System.out.println("Enter Number of Total Students: ");
       int totalStudents=input.nextInt();
       int classStudent=totalStudents;
       while (totalStudents > 0){
           System.out.printf("%s : %d %n%s","Roll No",totalStudents,"Press \"p\" for pass" +
                   " or Press \"f\" for fail");
           char reader=input.next().charAt(0);
           if (reader=='f'){
               failStudent++;
           }
           else if (reader=='p'){
               passStudent++;
           }
           totalStudents--;
       }
       System.out.printf("%s%d%n%s = %d %n%s = %d","Total Students In class : ",classStudent,"Number of Passed" +
               "students",passStudent,"Number of fail student",failStudent);

   }
}

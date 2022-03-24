package ch4;

import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        int countStd=0;
        int passedStd=0;
        int failedStd=0;
        Scanner scanner=new Scanner(System.in);
        while (countStd<=9){
            System.out.print("Enter result: ");
            int result=scanner.nextInt();
            System.out.println(result==1 ? (passedStd++) :(failedStd++));
            countStd++;
        }
        System.out.printf("%s = %d%n","Total Student",countStd);
        System.out.printf("Passed Students = %d%n",passedStd);
        System.out.printf("Failed Students = %d%n",failedStd);
       if (passedStd >= 8){
           System.out.println("Bonus to instructor");
       }
    }
}

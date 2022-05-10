package Ch7Arrays.java;

import java.util.Scanner;

public class TwoDimensional {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
       /* int[][] array=new int[5][8];
        for (int i=0; i<array.length; i++) {
            System.out.println("\t\tSTUDENT NUMBER " + i);
            System.out.print("Enter Student RollNo: ");
            array[i][0] = scanner.nextInt();
            System.out.print("Enter Math Number: ");
            array[i][1] = scanner.nextInt();
            System.out.print("Enter Computer Number: ");
            array[i][2] = scanner.nextInt();
            System.out.print("Enter Urdu Number: ");
            array[i][3] = scanner.nextInt();
            System.out.print("Enter English Number: ");
            array[i][4] = scanner.nextInt();
            System.out.print("Enter PST Number: ");
            array[i][5] = scanner.nextInt();
            System.out.print("Enter IST Number: ");
            array[i][6] = scanner.nextInt();
            System.out.print("Enter Physics Number: ");
            array[i][7] = scanner.nextInt();


        }

        System.out.printf("%20s%5s%5s%5s%8s%8s%8s%8s%n","\t\t\t\tROLLNO","\tMATH","\tCOMPUTER","\tURDU","\tEnglish","\tPST",
                "\tIST","\t\tPhysics");
        for (int i=0; i<array.length; i++){
            System.out.print(" STUDENT DATA :"+(i+1)+"---");

            System.out.printf("  %5d%7d%10d%12d%10d%10d%10d%10d%n",array[i][0],array[i][1],array[i][2],array
            [i][3],array[i][4],array[i][5],array[i][6],array[i][7]);
            System.out.println("\t\t\t\t--------------------------------------------------------------------------------");
        }*/
int [][] array={{1,23,45},{23,5,322}};
        System.out.println(array.length);
      for (int i:array[0]){
          System.out.println(i);
          System.out.println("errf");
      }
    }
}

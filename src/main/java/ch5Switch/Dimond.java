package ch5Switch;

import java.util.Scanner;

public class Dimond {
    public static void main(String[] args) {
        int middleRow = 0;
        int rowLess = 0;
        int count = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the rows of Dimond: ");
        int rows = scanner.nextInt();
        middleRow = (rows + 1) / 2;
        rowLess = middleRow;
        for (int i = 1; i <= rows; i++) {

            for (int j = 1; j <= rows; j++) {
                if (count > middleRow) {

                    if (j == 1) {
                        rowLess--;
                    }
                    if (j > (middleRow - rowLess) && j < (middleRow + rowLess)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }

                } else if (j > (middleRow - i) && j < (middleRow + i)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            count++;
            System.out.println("");
        }
    }
}

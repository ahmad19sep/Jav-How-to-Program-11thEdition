package Ch7Arrays.java;

import java.util.Scanner;

public class KnightTourChess {
    static int moves;
    static int[][] gameLength = new int[8][8];
    static int counter;
    static int currentRow;
    static int currentColumn;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the current position of Knight: ");
        currentRow = scanner.nextInt();
        currentColumn = scanner.nextInt();
        gameLength[currentRow][currentColumn] = 1;
        while (true) {
            counter = 0;
            leftUp();

            leftDown();

            rightUp();

            rightDown();

            upLeft();

            upRight();

            downRight();

            downLeft();


            if (counter == 8) {
                break;
            }
        }
        System.out.println(moves);
    }

    public static void upLeft() {

        try {
            if (gameLength[currentRow - 2][currentColumn - 1] != 1) {

                gameLength[currentRow - 2][currentColumn - 1] = 1;
                currentRow = currentRow - 2;
                currentColumn = currentColumn - 1;

                moves++;
            } else {
                counter++;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            counter++;
        }
    }


    public static void upRight() {

        try {
            if (gameLength[currentRow - 2][currentColumn + 1] != 1) {

                gameLength[currentRow - 2][currentColumn + 1] = 1;
                currentRow = currentRow - 2;
                currentColumn = currentColumn + 1;

                moves++;
            } else {
                counter++;
            }
        } catch (ArrayIndexOutOfBoundsException e) {

            counter++;
        }

    }


    public static void downLeft() {
        try {
            if (gameLength[currentRow + 2][currentColumn - 1] != 1) {

                gameLength[currentRow + 2][currentColumn - 1] = 1;
                currentRow = currentRow + 2;
                currentColumn = currentColumn - 1;

                moves++;
            } else {
                counter++;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            counter++;
        }

    }


    public static void downRight() {

        try {
            if (gameLength[currentRow + 2][currentColumn + 1] != 1) {

                gameLength[currentRow + 2][currentColumn + 1] = 1;
                currentRow = currentRow + 2;
                currentColumn = currentColumn + 1;

                moves++;
            } else {
                counter++;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            counter++;
        }


    }

    public static void leftUp() {
        try {
            if (gameLength[currentRow - 1][currentColumn - 2] != 1) {

                gameLength[currentRow - 1][currentColumn - 2] = 1;
                currentRow = currentRow - 1;
                currentColumn = currentColumn - 2;

                moves++;
            } else {
                counter++;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            counter++;
        }

    }

    public static void leftDown() {
        try {
            if (gameLength[currentRow + 1][currentColumn - 2] != 1) {

                gameLength[currentRow + 1][currentColumn - 2] = 1;
                currentRow = currentRow + 1;
                currentColumn = currentColumn - 2;

                moves++;
            } else {
                counter++;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            counter++;
        }

    }

    public static void rightUp() {
        try {

            if (gameLength[currentRow - 1][currentColumn + 2] != 1) {

                gameLength[currentRow - 1][currentColumn + 2] = 1;
                currentRow = currentRow - 1;
                currentColumn = currentColumn + 2;

                moves++;
            }
            counter++;
        } catch (ArrayIndexOutOfBoundsException e) {
            counter++;
        }

    }


    public static void rightDown() {
        try {

            if (gameLength[currentRow + 1][currentColumn + 2] != 1) {

                gameLength[currentRow + 1][currentColumn + 2] = 1;
                currentRow = currentRow + 1;
                currentColumn = currentColumn + 2;

                moves++;
            } else {
                counter++;
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            counter++;
        }

    }

}

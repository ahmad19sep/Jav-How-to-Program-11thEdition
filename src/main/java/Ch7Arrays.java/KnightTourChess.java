package Ch7Arrays.java;

import java.util.Arrays;
import java.util.Scanner;

public class KnightTourChess {
    static int moves;
    static int[][] gameLength = new int[8][8];
    static int counter;
    static int currentRow;
    static int currentColumn;

    public static void main(String[] args) {
        int maximumMoves = 0;
        int maxRow = 0;
        int maxColumn = 0;
        for (int i = 0; i < gameLength.length; i++) {

            for (int j = 0; j < gameLength[0].length; j++) {
                if (moves > maximumMoves) {
                    maximumMoves = moves;
                    maxRow = i;
                    maxColumn = j - 1;
                }
                Arrays.stream(gameLength).forEach(g -> Arrays.fill(g, 0));
                moves = 0;
                currentRow = i;
                currentColumn = j;
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


            }
        }
        System.out.print("Row: " + maxRow + " Column: " + maxColumn +
                " has Maximum moves = " + maximumMoves);


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

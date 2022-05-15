package Ch7Arrays.java;

import java.util.Arrays;
import java.util.Scanner;

public class KnightTourSeason2 {

        static int moves;
        static int[][] gameLength = new int[8][8];
        static int[][] knightMoves = new int[8][8];
        static int counter;
        static int currentRow;
        static int currentColumn;
        static Scanner scanner=new Scanner(System.in);

        public static void main(String[] args) {
            System.out.println("Enter current location of Knight");
            System.out.print("Row position: ");
            int row=scanner.nextInt();
            System.out.print("Column position: ");
            int column=scanner.nextInt();
                    moves = 0;
                    currentRow = row;
                    currentColumn = column;
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


            System.out.println("Row: " + row + " Column: " + column +
                    " has Maximum moves = " + moves);
            System.out.println();
            System.out.println("Night trying to come again on each index ");
            for (int[] i : knightMoves) {
                for (int j : i) {
                    System.out.print("   " + j);
                }
                System.out.println();
            }
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
                    ++knightMoves[currentRow - 2][currentColumn - 1];
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
                    ++knightMoves[currentRow - 2][currentColumn + 1];
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
                    ++knightMoves[currentRow + 2][currentColumn - 1];
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
                    ++knightMoves[currentRow + 2][currentColumn + 1];
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
                    ++knightMoves[currentRow - 1][currentColumn - 2];
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
                    ++knightMoves[currentRow + 1][currentColumn - 2];
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
                } else {
                    counter++;
                    ++knightMoves[currentRow - 1][currentColumn + 2];
                }

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
                    ++knightMoves[currentRow + 1][currentColumn + 2];
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                counter++;
            }

        }

    }


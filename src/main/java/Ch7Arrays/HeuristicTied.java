package Ch7Arrays.java;

import java.util.Scanner;

public class HeuristicTied {
    static int currentRow;
    static int currentColumn;
    static int minimumValue;
    static int counter;
    static int rowChecker;
    static int columnChecker;
    static int setMinimumValue = 0;
    static Scanner scanner = new Scanner(System.in);
    static int[][] accessibility =
            {{2, 3, 4, 4, 4, 4, 3, 2},
                    {3, 4, 6, 6, 6, 6, 4, 3},
                    {4, 6, 8, 8, 8, 8, 6, 4},
                    {4, 6, 8, 8, 8, 8, 6, 4},
                    {4, 6, 8, 8, 8, 8, 6, 4},
                    {4, 6, 8, 8, 8, 8, 6, 4},
                    {3, 4, 6, 6, 6, 6, 4, 3},
                    {2, 3, 4, 4, 4, 4, 3, 2}};


    public static void main(String[] args) {
        System.out.println("Enter current location of Knight");
        System.out.print("Row position: ");
        int row = scanner.nextInt();
        System.out.print("Column position: ");
        int column = scanner.nextInt();
        currentColumn = column;
        currentRow = row;
        rowChecker = row;
        columnChecker = column;
        minimumValue = accessibility[currentRow][currentColumn];
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
            currentColumn = columnChecker;
            currentRow = rowChecker;
            accessibility[currentRow][currentColumn] = 1;
            setMinimumValue=0;

            if (counter == 8) {
                break;
            }
        }
        for (int[] i : accessibility) {
            for (int j : i) {
                System.out.print(" " + j);
            }
            System.out.println();
        }


    }


    public static void upLeft() {

        try {
            if (accessibility[currentRow - 2][currentColumn - 1] != 1) {

                if (setMinimumValue == 0) {
                    minimumValue = accessibility[currentRow - 2][currentColumn - 1];
                    setMinimumValue++;
                }
                if (accessibility[currentRow - 2][currentColumn - 1] < minimumValue) {
                    minimumValue = accessibility[currentRow - 2][currentColumn - 1];
                    rowChecker = currentRow;
                    columnChecker = currentColumn;
                    rowChecker = currentRow - 2;
                    columnChecker = currentColumn - 1;
                }else if (accessibility[currentRow - 2][currentColumn - 1] == minimumValue){

                }

            } else {
                counter++;

            }
        } catch (ArrayIndexOutOfBoundsException e) {
            counter++;
        }
    }


    public static void upRight() {

        try {
            if (accessibility[currentRow - 2][currentColumn + 1] != 1) {
                if (setMinimumValue == 0) {
                    minimumValue = accessibility[currentRow - 2][currentColumn + 1];
                    setMinimumValue++;
                }
                if (accessibility[currentRow - 2][currentColumn + 1] <= minimumValue) {
                    minimumValue = accessibility[currentRow - 2][currentColumn + 1];
                    rowChecker = currentRow;
                    columnChecker = currentColumn;

                    rowChecker = currentRow - 2;
                    columnChecker = currentColumn + 1;
                }

            } else {
                counter++;

            }
        } catch (ArrayIndexOutOfBoundsException e) {

            counter++;
        }

    }


    public static void downLeft() {
        try {
            if (accessibility[currentRow + 2][currentColumn - 1] != 1) {
                if (setMinimumValue == 0) {
                    minimumValue = accessibility[currentRow + 2][currentColumn - 1];
                    setMinimumValue++;
                }
                if (accessibility[currentRow + 2][currentColumn - 1] <= minimumValue) {
                    minimumValue = accessibility[currentRow + 2][currentColumn - 1];
                    rowChecker = currentRow;
                    columnChecker = currentColumn;
                    rowChecker = currentRow + 2;
                    columnChecker = currentColumn - 1;
                }
            } else {
                counter++;

            }
        } catch (ArrayIndexOutOfBoundsException e) {
            counter++;
        }

    }


    public static void downRight() {

        try {
            if (accessibility[currentRow + 2][currentColumn + 1] != 1) {
                if (setMinimumValue == 0) {
                    minimumValue = accessibility[currentRow + 2][currentColumn + 1];
                    setMinimumValue++;
                }
                if (accessibility[currentRow + 2][currentColumn + 1] <= minimumValue) {
                    minimumValue = accessibility[currentRow + 2][currentColumn + 1];
                    rowChecker = currentRow;
                    columnChecker = currentColumn;
                    rowChecker = currentRow + 2;
                    columnChecker = currentColumn + 1;
                }

            } else {
                counter++;

            }
        } catch (ArrayIndexOutOfBoundsException e) {
            counter++;
        }


    }

    public static void leftUp() {
        try {
            if (accessibility[currentRow - 1][currentColumn - 2] != 1) {
                if (setMinimumValue == 0) {
                    minimumValue = accessibility[currentRow - 1][currentColumn - 2];
                    setMinimumValue++;
                }
                if (accessibility[currentRow - 1][currentColumn - 2] <= minimumValue) {
                    minimumValue = accessibility[currentRow - 1][currentColumn - 2];
                    rowChecker = currentRow;
                    columnChecker = currentColumn;
                    rowChecker = currentRow - 1;
                    columnChecker = currentColumn - 2;
                }


            } else {
                counter++;

            }
        } catch (ArrayIndexOutOfBoundsException e) {
            counter++;
        }

    }

    public static void leftDown() {
        try {
            if (accessibility[currentRow + 1][currentColumn - 2] != 1) {
                if (setMinimumValue == 0) {
                    minimumValue = accessibility[currentRow + 1][currentColumn - 2];
                    setMinimumValue++;
                }
                if (accessibility[currentRow + 1][currentColumn - 2] <= minimumValue) {
                    minimumValue = accessibility[currentRow + 1][currentColumn - 2];
                    rowChecker = currentRow;
                    columnChecker = currentColumn;
                    rowChecker = currentRow + 1;
                    columnChecker = currentColumn - 2;
                }

            } else {
                counter++;

            }
        } catch (ArrayIndexOutOfBoundsException e) {
            counter++;
        }

    }

    public static void rightUp() {
        try {

            if (accessibility[currentRow - 1][currentColumn + 2] != 1) {
                if (setMinimumValue == 0) {
                    minimumValue = accessibility[currentRow - 1][currentColumn + 2];
                    setMinimumValue++;
                }
                if (accessibility[currentRow - 1][currentColumn + 2] <= minimumValue) {
                    minimumValue = accessibility[currentRow - 1][currentColumn + 2];
                    rowChecker = currentRow;
                    columnChecker = currentColumn;
                    rowChecker = currentRow - 1;
                    columnChecker = currentColumn + 2;

                }

            } else {
                counter++;

            }

        } catch (ArrayIndexOutOfBoundsException e) {
            counter++;
        }

    }


    public static void rightDown() {
        try {

            if (accessibility[currentRow + 1][currentColumn + 2] != 1) {
                if (setMinimumValue == 0) {
                    minimumValue = accessibility[currentRow + 1][currentColumn + 2];
                    setMinimumValue++;
                }
                if (accessibility[currentRow + 1][currentColumn + 2] <= minimumValue) {
                    minimumValue = accessibility[currentRow + 1][currentColumn + 2];
                    rowChecker = currentRow;
                    columnChecker = currentColumn;
                    rowChecker = currentRow + 1;
                    columnChecker = currentColumn + 2;
                }

            } else {
                counter++;

            }
        } catch (ArrayIndexOutOfBoundsException e) {
            counter++;
        }

    }

}

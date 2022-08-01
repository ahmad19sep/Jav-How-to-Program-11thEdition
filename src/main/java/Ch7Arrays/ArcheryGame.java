package Ch7Arrays.java;

import java.security.SecureRandom;

public class ArcheryGame {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        String player1 = "Asad";
        int asadScore = 0;
        String player2 = "Ahmad";
        int ahmadScore = 0;
        String player3 = "Shahzad";
        int shahzadScore = 0;
        String player4 = "Ali";
        int aliScore = 0;
        int[][] array = new int[4][3];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                int a = random.nextInt(10);
                array[i][j] = a;
                if (i == 0) {
                    asadScore += a;
                } else if (i == 1) {

                    ahmadScore += a;

                } else if (i == 2) {
                    shahzadScore += a;
                } else {
                    aliScore += a;
                }

            }
        }

        int a = 0;
        System.out.println("NAME    Roll:1   Roll:2   Roll: 2   Total");
        for (int[] j : array) {

            if (a == 0) {
                System.out.print(player1);
                for (int k : j) {
                    System.out.printf("%7d ", k);

                }
                a++;

                System.out.printf("%7d%n", asadScore);
            } else if (a == 1) {
                System.out.println(player2);
                for (int k : j) {
                    System.out.printf("%10d ", k);

                }
                a++;
                System.out.printf("%7d%n", ahmadScore);
            } else if (a == 2) {
                System.out.println(player3);
                for (int k : j) {
                    System.out.printf("%7d ", k);

                }
                a++;
                System.out.printf("%7d%n", shahzadScore);
            } else if (a == 3) {
                System.out.println(player4);
                for (int k : j) {
                    System.out.printf("%7d ", k);

                }

                System.out.printf("%7d%n", aliScore);
            }


        }

    }
}

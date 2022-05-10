package Ch7Arrays.java;

import java.security.SecureRandom;

public class DiceRollingEx7 {
    static SecureRandom random = new SecureRandom();

    public static void main(String[] args) {
        int[][] dice = new int[6][6];
        for (int i = 0; i < 72; i++) {
            int random1 = 1 + random.nextInt(6);
            int random2 = 1 + random.nextInt(6);
            int sumOfTwo = random1 + random2;
            for (int j = 1; j <= dice.length; j++) {
                for (int k = 1; k <= dice[0].length; k++) {
                    if (j + k == sumOfTwo) {
                        dice[j-1][k-1] = sumOfTwo;
                        System.out.println(dice[j-1][k-1]);
                    }
                }
            }
        }
        for (int[] i : dice) {
            for (int j : i) {
                System.out.printf("        %d", j);
            }
            System.out.println();

        }
    }
}

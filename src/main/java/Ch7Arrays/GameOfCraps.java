package Ch7Arrays.java;

import java.security.SecureRandom;
import java.util.Arrays;

public class GameOfCraps {
    public static enum status {
        WIN, LOSE, CONTINUE
    }

    static SecureRandom random = new SecureRandom();
    static int[] gameWin = new int[21];
    static int[] gameLose = new int[21];
    static int rollCounter;
    static int lengthOfGame=0;

    public static void main(String[] args) {
        int point = 0;

        status currentStatus;
        for (int i = 0; i < 10_000_00; i++) {
          // System.out.println("Current game #: " + i);
            rollCounter = 0;
            int sum = rollDice();

            switch (sum) {
                case 7:
                case 11:
                    currentStatus = status.WIN;
                    ++gameWin[rollCounter];
                    break;
                case 3:
                case 2:
                case 12:
                    ++gameLose[rollCounter];
                    currentStatus = status.LOSE;
                    break;
                default:
                    point = sum;
                    currentStatus = status.CONTINUE;
            }


            while (currentStatus == status.CONTINUE) {
                sum = rollDice();
                if (sum == point) {
                    if (rollCounter > 20)
                        ++gameWin[0];
                    else
                        ++gameWin[rollCounter];
                    currentStatus = status.WIN;
                }
                if (sum == 7) {
                    if (rollCounter > 20)
                        ++gameLose[0];
                    else
                        ++gameLose[rollCounter];
                    currentStatus = status.LOSE;
                }
            }
        }
        int chanceWin=0;
        int chanceLose=0;
        System.out.println("Rolls\t\tGameWin\t\tGameLose");
        System.out.println("--------------------------------------------------");
        for (int i = 1; i <= gameWin.length; i++) {
             chanceWin+=gameWin[i-1];
             chanceLose+=gameLose[i-1];

            if (i < gameWin.length) {
                System.out.printf("%d%17d%15d%n", i, gameWin[i], gameLose[i]);
                System.out.println("--------------------------------------------------------");
            } else {
                System.out.println("\t\tAfter 20th roll ");
                System.out.printf("Game win: %d Game loss: %d%n", gameWin[0], gameLose[0]);
                System.out.println("--------------------------------------------------------%n");
            }

        } System.out.println("Win chances: "+(chanceWin*100)/1000000+"%");
        System.out.println("lose chances: "+(chanceLose*100)/1000000+"%");
        System.out.println("------------------------------------------------------");

        System.out.println("Average length of game is: "+lengthOfGame/10_000_00);

    }

    public static int rollDice() {
        int a = 1 + random.nextInt(6);
        int b = 1 + random.nextInt(6);
         lengthOfGame+=rollCounter++;

        return a + b;
    }


}




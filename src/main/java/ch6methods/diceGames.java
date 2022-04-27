package ch6methods;

import java.security.SecureRandom;
import java.util.Scanner;

//enum types
public class diceGames {
    public static enum status {
        WIN, LOSE, CONTINUE
    }

    static SecureRandom randomNum = new SecureRandom();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int myPoint = 0;
        int bankBalance = 1000;
        int wager=0;
        while (true) {
            System.out.print("Enter Wager: ");
             wager = scanner.nextInt();
            if (wager <= bankBalance) {
                break;
            } else {
                System.out.println("Your account Balance is " + bankBalance);
            }
        }
        status currentStatus;
        int sumDice = rollDice();

        switch (sumDice) {
            case 7:
            case 11:
                currentStatus = status.WIN;

                myPoint = sumDice;
                break;
            case 2:
            case 3:
            case 12:
                currentStatus = status.LOSE;


                myPoint = sumDice;
                break;
            default:
                currentStatus = status.CONTINUE;
                myPoint = sumDice;
                System.out.printf("%s\t%d%n", "Points", myPoint);

        }
        while (currentStatus == status.CONTINUE) {
            sumDice = rollDice();
            if (sumDice == myPoint) {
                currentStatus = status.WIN;
                break;
            } else if (sumDice == 7) {
                currentStatus = status.LOSE;


            }

        }
        if (currentStatus == status.LOSE) {
            System.out.println("You lose your game ");
            bankBalance-=wager;
            if (bankBalance<=0){
                System.out.println("\"Sorry.you busted\"");
            }
            System.out.println("New bank Balance is :" +bankBalance);
        } else {
            bankBalance+=wager;
            System.out.println("New bank Balance is :" +bankBalance);

            System.out.println("You  Win ");
        }
    }

    public static int rollDice() {
        int num1 = 1 + randomNum.nextInt(6);
        int num2 = 1 + randomNum.nextInt(6);
        int sum = num1 + num2;
        System.out.println("Player rolled " + num2 + " + " + num1 + " = " + (sum));
        return sum;

    }
}

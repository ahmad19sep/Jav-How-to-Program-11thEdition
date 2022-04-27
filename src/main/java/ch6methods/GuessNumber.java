package ch6methods;

import java.security.SecureRandom;
import java.util.Scanner;

public class GuessNumber {
    SecureRandom num = new SecureRandom();

    static Scanner input = new Scanner(System.in);
    static int count = 0;

    public static void main(String[] args) {

        while (true) {
            System.out.print("Guess the number b/w 1-1000: ");
            int num = input.nextInt();
            int randomNum = randomNum(num);


            if (num == randomNum) {

                System.out.println("Congratulations you guess the number correctly");
                System.out.println("You want to playAgain press \"1\" or \"0\" to not");
                if (input.nextInt() == 0) {
                    break;
                }

            } else {
                count = 0;
                while (true) {

                    if (count <= 10) {
                        System.out.println("Oops! Wrong Number, please tryAgain");
                        if (num >= randomNum) {
                            System.out.println("Number is Too High");
                            num = input.nextInt();
                        } else if (num <= randomNum) {
                            System.out.println("Number is Too Low");
                            num = input.nextInt();
                        }
                        if (num == randomNum) {
                            numberOfTimes();
                            break;
                        }
                        count++;

                    } else if (count > 10) {
                        numberOfTimes();
                        break;


                    }
                }
            }

        }

    }


    public static int randomNum(int guessNum) {
        SecureRandom num = new SecureRandom();
        int num1 = 1 + num.nextInt(1000);
        System.out.println(num1);
        return num1;

    }

    public static void numberOfTimes() {
        if (count <= 10) {
            System.out.println("You know the secret and you got lucky");
        }
        if (count >= 10) {
            System.out.println("You should be able to do better ");
        }
    }

    /*public static int equalRandom() {
        System.out.println("Congratulations you guess the number correctly");
        System.out.println("You want to playAgain press \"1\" or \"0\" to not");

    }*/
}
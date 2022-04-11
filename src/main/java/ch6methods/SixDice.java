package ch6methods;

import java.security.SecureRandom;

public class SixDice {
    public static void main(String[] args) {
        SecureRandom number=new SecureRandom();
        int dice1=0;
        int dice2=0;
        int dice3=0;
        int dice4=0;
        int dice5=0;
        int dice6=0;
        for (int i=1; i<=60000000;i++){
            int randomNo=number.nextInt(6);
            switch (randomNo){
                case 1:
                    ++dice1;
                    break;
                case 2:
                    ++dice2;
                    break;
                case 3:
                    ++dice3;
                    break;
                case 4:
                    ++dice4;
                    break;
                case 5:
                    ++dice5;
                    break;
                case 6:
                    ++dice6;
                    break;
            }
        }
    }
}

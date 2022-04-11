package ch6methods;

import java.security.SecureRandom;

public class sixD {

            public static void main(String[] args) {
                SecureRandom number=new SecureRandom();
                int dice1=0;
                int dice2=0;
                int dice3=0;
                int dice4=0;
                int dice5=0;
                int dice6=0;
                for (int i=1; i<=600000;i++){
                    int randomNo=1+number.nextInt(6);
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
                System.out.printf("%s\t\t%d%n%s\t\t%d%n%s\t\t%d%n%s" +
                        "\t\t%d%n%s\t\t%d%n%s\t\t%d%n","Dice1",dice1
                ,"Dice2",dice2,"Dice3",dice3,"Dice4",dice4,"Dice5",dice5,"Dice6",dice6);

            }

}

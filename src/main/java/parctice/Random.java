package parctice;

import java.security.SecureRandom;

public class Random {
    public static void main(String[] args) {
        SecureRandom num = new SecureRandom();

        for (int i = 0; i < 36; i++) {
            int randomGeneration = 1 + num.nextInt(6);
            System.out.print(randomGeneration+"  ");
            if ((i+1)%6==0){
                System.out.println("\n");
            }
        }
    }
}

package ch6methods;

import java.security.SecureRandom;

public class RandomNu {

    public static void main(String[] args) {
        SecureRandom input = new SecureRandom();
        for (int i = 1; i < 6; i++) {
            int n = (int) (2 + (Math.pow(2, i)) * input.nextInt(6));
            System.out.print(n + "\t");
        }
    }
}

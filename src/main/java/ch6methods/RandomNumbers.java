package ch6methods;

import java.security.SecureRandom;

public class RandomNumbers {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        for (int i = 1; i <= 5; i++) {
            int face = random.nextInt(60_000_000_0);
            System.out.println(face);
        }

    }
}

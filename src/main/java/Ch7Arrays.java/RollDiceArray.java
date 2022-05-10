package Ch7Arrays.java;

import java.security.SecureRandom;

public class RollDiceArray {
    public static void main(String[] args) {
        SecureRandom input=new SecureRandom();
        int[] frequency =new int[7];
        for (int roll=0; roll<=600; roll++){
            ++frequency[1+input.nextInt(6)];
        }
        System.out.printf("%s%10s%n","Face","Frequency");
        for (int face=1; face<frequency.length; face++){
            System.out.printf("%4d%10d%n",face,frequency[face]);
        }

    }
}

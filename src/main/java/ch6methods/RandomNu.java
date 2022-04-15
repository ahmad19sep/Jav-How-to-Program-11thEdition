package ch6methods;

import java.security.SecureRandom;

public class RandomNu {

    public static void main(String[] args) {
        SecureRandom input = new SecureRandom();

        //Sequence 1,2,4,8,16,32
        System.out.println("Sequence 1,2,4,8,16,32");
            int n = (int)((2)*Math.pow(2,input.nextInt(5)));
            System.out.println(n + "\n");
        System.out.println("Sequence 10,20,30,40");
         //Sequence 10,20,30,40
        int n1=(20)+(10)*input.nextInt(3);
        System.out.println(n1);
        System.out.println("Sequence 0,3,6,9,12");
        //Sequence 0,3,6,9,12
        int n2=3+3*input.nextInt(4);
        System.out.println(n2);
    }
}

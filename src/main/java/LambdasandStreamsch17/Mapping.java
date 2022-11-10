package LambdasandStreamsch17;

import javax.print.attribute.IntegerSyntax;
import java.util.stream.IntStream;

public class Mapping {
    public static void main(String[] args) {
        //Using simple for loop
        int sum = 0;
        for (int i = 1; i <= 20; i++) {
            sum += i % 2;
        }
        System.out.printf("Using for loop %d", sum);
        /**
         * Using Stream and lambds
         *
         */
        int sum1 = IntStream.rangeClosed(1, 20).map(x -> x % 2).sum();
        System.out.printf("Sum using Stream %d", sum1);

        /**
         * Using condition with loop
         */
        for (int i = 0; i <= 20; i++) {
            if (i % 4 == 0) {
                System.out.println(i);
            }
        }
        /**
         * Using stream and lambds
         */
        System.out.println(IntStream.rangeClosed(1, 20).filter(x -> x % 4 == 0).max());
        /**
         * Using map and filter together
         */
        System.out.println(IntStream.rangeClosed(1, 40).filter(x -> x / 10 == 0).map(x -> x * 2).sum());
    }
}
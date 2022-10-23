package LambdasandStreamsch17;

import java.util.stream.IntStream;

public class InStreamSum {
    public static void main(String[] args) {
        // Simple Sum using loop
        int sum=0;
        for (int i=1; i<=10; i++){
            sum+=i;
        }
        System.out.printf("sum using loop %d%n",sum);
        /**
         * Now we using Streams to do this program very easy
         */
        System.out.printf("Sum of  1 to 10 is: %d%n",IntStream.rangeClosed(1,10).sum());
        System.out.printf("Sum of  1 to 10 is: %s%n",IntStream.rangeClosed(1,10).max());
        //System.out.printf("Sum of  1 to 10 is: %s",IntStream.rangeClosed(1,10).distinct());
        System.out.printf("Sum of  1 to 10 is: %s%n",IntStream.rangeClosed(1,10).average());
        System.out.printf("Sum of  1 to 10 is: %s%n",IntStream.rangeClosed(1,10).summaryStatistics());
    }
}

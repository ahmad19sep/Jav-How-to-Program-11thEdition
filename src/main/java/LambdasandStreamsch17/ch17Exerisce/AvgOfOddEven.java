package LambdasandStreamsch17.ch17Exerisce;

import java.security.SecureRandom;
import java.util.stream.IntStream;

public class AvgOfOddEven {
    public static void main(String[] args) {
        SecureRandom random=new SecureRandom();
        //creating every time new Numbers
              // Even Numbers
       long even= random.ints(10,1,1000)
                .filter(x->x%2==0)
               .count();
       // Odd Numbers
        long odd= random.ints(10,1,1000)
                .filter(x->x%2!=0)
                .count();
       // Avg of all numbers
         double avg= random.ints(10,1,1000)
                .average()
                 .getAsDouble();
         double avgEven1=random.ints(10,1,1000)
                 .filter(x->x%2==0)
                 .average().getAsDouble();
         double avgOdd1=random.ints(10,1,1000)
                 .filter(x->x%2!=0)
                 .average().getAsDouble();


        //Solving the problem using fixed number

        IntStream num=random.ints(10,1,1000);

           // Even numbers
        /*long even1=num.filter(x->x%2==0)
                .count();
        // Odd Numbers
        long odd1=num.filter(x->x%2!=0)
                .count();
        // Avg of all
        double avg1=num.average()
                .getAsDouble();
        // Avg of even
        double avgEven=num.filter(x->x%2==0)
                .average()
                .getAsDouble();
        //Avg of odd
        double avgOdd=num.filter(x->x%2==0)
                .average()
                .getAsDouble();*/

        System.out.printf("Even Numbers: %d\n" +
                "Odd Numbers: %d\n" +
                "Avg of all: %.2f\n" +
                "Avg of Even: %.2f\n" +
                "Avg of Odd: %.2f\n" +
                "",even,odd,avg,avgEven1,avgOdd1);
    }
}

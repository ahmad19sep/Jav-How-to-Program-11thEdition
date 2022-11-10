package LambdasandStreamsch17.LambdsOnly;

import java.security.SecureRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class IntStreamOperations {
    public static void main(String[] args) {
        System.out.println("******** Some Simple functions *********");
        int[] value={6,88,5,33,4,2,6,88,43,24,8,66,4,};
        //First Print all the numbers using method reference
        System.out.println("Print elements using method reference");
        IntStream.of(value).forEach(System.out::print);

        //Now converting values  int to String
        String numbers=IntStream.of(value).mapToObj(String::valueOf)
                .collect(Collectors.joining("_"));
        System.out.printf("%nConvert value into String:  %s%n",numbers);

        // To count total elements in the stream
        System.out.println("Total Number of elements: "+IntStream.of(value).count());

        //To find the greatest number
        System.out.println("Maximum value: "+IntStream.of(value).max().getAsInt());

        //To find the lowest number
        System.out.println("Minimum value: "+IntStream.of(value).min().getAsInt());

        // To find the sum of all elements
        System.out.println("Sum of all elements: "+IntStream.of(value).sum());

        //Avg of all the elements
        System.out.printf("Average of all the elements: %.2f%n",IntStream.of(value).average().getAsDouble());

        //Sum via reduce method
        System.out.printf("Sum via reduce method: %d%n",IntStream.of(value).reduce(15, Integer::sum));

        // Multiply via reduce method
        System.out.printf("Multiply via reduce method (base case 0): %d%n",IntStream.of(value).reduce(0,(x,y)->x*y));
        System.out.printf("Multiply via reduce method (base case 1): %d%n",IntStream.of(value).reduce(1,(x,y)->x*y));

        //Sorting the values
        System.out.println("Sorting :"+IntStream.of(value).sorted().mapToObj(String::valueOf).collect(Collectors.joining(" ")));

        //Using filter method
        int sumOfEven=IntStream.of(value).filter(x->x%2==0).sum();
        System.out.println("Sum of Even after Filtering: "+sumOfEven);

        //Using map
        System.out.println("Using map and Modifing the elements and printing sum: "+IntStream.of(value).map(x->x*3).sum());

        //Using distinct method
        System.out.println("Distinct method remove repeated numbers: "+IntStream
                .of(value)
                .distinct()
                .mapToObj(String::valueOf)
                        .sorted(String.CASE_INSENSITIVE_ORDER)
                .collect(Collectors.joining(" ")));

        //using limit
        System.out.println("Using limit: "+IntStream.of(value).limit(3).min().getAsInt());

        //SummaryStatics

        System.out.println(IntStream.of(value).summaryStatistics());

        /**
         * output
         * ******** Some Simple functions *********
         * Print elements using method reference
         * 6885334268843248664
         * Convert value into String:  6_88_5_33_4_2_6_88_43_24_8_66_4
         * Total Number of elements: 13
         * Maximum value: 88
         * Minimum value: 2
         * Sum of all elements: 377
         * Average of all the elements: 29.00
         * Sum via reduce method: 392
         * Multiply via reduce method (base case 0): 0
         * Multiply via reduce method (base case 1): -800063488
         * Sorting :2 4 4 5 6 6 8 24 33 43 66 88 88
         * Sum of Even after Filtering: 296
         * Using map and Modifing the elements and printing sum: 1131
         * Distinct method remove repeated numbers: 6 88 5 33 4 2 43 24 8 66
         * Using limit: 5
         * IntSummaryStatistics{count=13, sum=377, min=2, average=29.000000, max=88}
         */



    }
}

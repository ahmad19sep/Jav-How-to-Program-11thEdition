package LambdasandStreamsch17.LambdsOnly;

import java.util.stream.IntStream;

public class FilterLambds {
    public static void main(String[] args) {
        // Code without lambds Expression
        int total;
        for (int i=1; i<=10; i++){
            if (i%2==0){
                total=i*3;
            }
        }// Uisng Lambds Expression
        System.out.printf("Sum of the triples of the even event is %d%n", IntStream.rangeClosed(1,10)
                .filter(x ->x%2==0).map(x->x*3).sum());
    }



}

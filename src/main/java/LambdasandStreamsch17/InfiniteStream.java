package LambdasandStreamsch17;

import java.util.Random;
import java.util.stream.IntStream;

public class InfiniteStream {
    public static void main(String[] args) {
        Random random=new Random();
        IntStream.iterate(0,x->x+1)
                .limit(30)
                .forEach(System.out::println);

        //Generate random numbers
        IntStream.generate(random::nextInt).limit(33).forEach(System.out::println);
        
    }

}

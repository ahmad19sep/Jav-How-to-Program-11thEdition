package LambdasandStreamsch17.LambdsOnly;

import java.security.SecureRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamMethodReference {
    public static void main(String[] args) {
        SecureRandom random=new SecureRandom();
        random.ints(10,4,12)
                .forEach(System.out::print);

         IntStream.rangeClosed(1, 10).map(x -> x * 2).forEach(System.out::print);
        String numbers=IntStream.rangeClosed(1,10).map(x->x*3).mapToObj(String::valueOf).collect(Collectors.joining("-"));
        System.out.println(numbers);
    }
}

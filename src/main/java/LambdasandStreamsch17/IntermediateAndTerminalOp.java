package LambdasandStreamsch17;

import java.util.Arrays;
import java.util.Locale;
import java.util.stream.IntStream;

public class IntermediateAndTerminalOp {
    public static void main(String[] args) {
        Arrays.stream(new String[]{"aa", "bb","aa","ali",})
                .distinct()
                .map(s -> s.toUpperCase(Locale.ROOT))
                .forEach(System.out::println);
        System.out.println( IntStream.rangeClosed(1,20).filter(x->x/2==0).limit(3).findFirst().getAsInt());


        long n = IntStream.rangeClosed(1,100)
                .filter(i -> i%2==0)
                .filter(i -> i%5==0)
                .count();

    }
}

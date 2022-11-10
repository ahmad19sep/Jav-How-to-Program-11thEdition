package DynamicProgramming.ch18;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

public class BooleanFunctions {
    public static void main(String[] args) {

        IntPredicate even=value->value%2==0;
        IntPredicate gt5=value->value>5;
         IntStream.rangeClosed(1,10)
                 .filter(even.and(gt5))
                 .forEach(System.out::println);
    }
}

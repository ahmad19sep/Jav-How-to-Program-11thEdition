package LambdasandStreamsch17;

import java.security.SecureRandom;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RandomIntStream {
    public static void main(String[] args) {
        SecureRandom random=new SecureRandom();
        random.ints(6000000,1,7)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .forEach((face,frequency)-> System.out.println(" "+face+" "+frequency));

    }
}

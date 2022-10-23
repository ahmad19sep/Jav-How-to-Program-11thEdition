package LambdasandStreamsch17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DelcartiveVsImperative {
    public static void main(String[] args) {
        /**
         * Imperative programming
         */
        List<Integer> list= Arrays.asList(1,3,4,3,5,32,4,5,63,32,2);
        List<Integer> list1=new ArrayList<>();
for (int i : list){
    if (!list1.contains(i))  list1.add(i);
}
        System.out.println(list1);

/**
 * Declarative programming
 */
        list1=list.stream().distinct().collect(Collectors.toList());
        System.out.println(list1);
    }

}

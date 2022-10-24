package LambdasandStreamsch17.LambdsOnly;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamInteger {
    public static void main(String[] args) {
        Integer[] values={3,2,4,5,66,77,6,43,8,9};
        //Original values
        System.out.println("***** Original values ******");
        System.out.println(Arrays.toString(values));
        // Sorting the Array and store the value in the list
       List<Integer> e= Arrays.stream(values).sorted().collect(Collectors.toList());
       //printing the list
        System.out.println("Sorted List: "+e);
        //take values less than five and store in the list
        e=Arrays.stream(values).filter(x->x<5).collect(Collectors.toList());
        System.out.println("Values less than 5 in the list"+e);
        //using  greater function and sorting and than multipling values



    }
}

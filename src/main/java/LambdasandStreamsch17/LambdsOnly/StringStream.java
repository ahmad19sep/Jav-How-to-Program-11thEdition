package LambdasandStreamsch17.LambdsOnly;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringStream {
    public static void main(String[] args) {
        String[] names={"Ali","Ahmad","Shahzad","Siddique","Shaheen","Mehmood","Amina","Smr"};
        System.out.println("-----------printing Original values----------");
        System.out.println(Arrays.toString(names));
        //Sorting the names using stream sort
        System.out.println("Sorting name: "+Arrays.stream(names).sorted().collect(Collectors.joining(" ")));
        //filters the name
        System.out.println("Filtering the name :"+Arrays.stream(names).filter(x->x.startsWith("A")).collect(Collectors.toList()));
        //printing all in uppercase
        System.out.println("Upper case: "+Arrays.stream(names).map(String::toUpperCase).collect(Collectors.toList()));
        //
        System.out.println("Reverse oder "+Arrays.stream(names).filter(s->s.compareTo("S")>0).sorted(String.CASE_INSENSITIVE_ORDER.reversed()).collect(Collectors.toList()));

    }
}

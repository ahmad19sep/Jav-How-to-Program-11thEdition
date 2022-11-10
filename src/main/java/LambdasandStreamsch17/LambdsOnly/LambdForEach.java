package LambdasandStreamsch17.LambdsOnly;

import java.util.ArrayList;
import java.util.List;

public class LambdForEach {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(2);
        list.add(9);
        list.add(78);
        list.add(2);

        for (int i : list){
            System.out.print(" "+i);
        }
      list.forEach(System.out::print);
    }

}

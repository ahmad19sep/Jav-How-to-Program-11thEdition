package Ch16GenericCollections;

import Hacker.java.Hacker.Interface.ArrayList1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Shuffle {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(3);
        list.add(4);
     Integer[] a={4,22,5,3,6,3,3,2,566,43,677,8,4387,8};
        Collections.addAll(list, a);
        Collections.shuffle(list);
        System.out.println(list);
    }
}

package Ch16GenericCollections;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {
    //HashSet is veryEfficient than others like Arraylist
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet();
        set.add(4);
        set.add(1);
        set.add(2);
        set.add(7);
        set.add(1);
        //Performing functions
        if (set.contains(7)){
            System.out.println("Contains 7");
        }
        //Set contains only different elements like "1","1" but in set only one '1' see
        System.out.println(set);
        System.out.println("\n Size of set : "+set.size());
        //Iterating set
        Iterator<Integer> it=set.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
            it.remove();

        }
        System.out.println(" Size of set after removing elements : "+set.size());
        // Removing elements after printing


    }
}
/**
 * output:-
 * Contains 7
 * [1, 2, 4, 7]
 *  Size of set : 4
 * 1
 * 2
 * 4
 * 7
 *  Size of set after removing elements : 0
 *
 */

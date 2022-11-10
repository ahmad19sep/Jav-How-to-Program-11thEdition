package Ch16GenericCollections;

import java.util.SortedSet;
import java.util.TreeSet;

public class Treeset {
    public static void main(String[] args) {
        SortedSet<String> set = new TreeSet<>();
        set.add("ALi");
        set.add("Shahzad");
        set.add("Siddique");
        set.add("Ahmad");
        set.add("John");
        //Tree set print elements in ordered way like
        System.out.println(set);

        // Using some functions
        System.out.println("Print first element : " + set.first());
        System.out.println("Print last element : " + set.last());
        System.out.println("Print before selective element" + set.headSet("John"));
        System.out.println("Print from  selective element to end" + set.tailSet("John"));
        set.remove("Ahmad");
        //print elements one by one
        for (String e : set) {
            System.out.println(e);
        }
    }
}
/**
 * output-:
 * [ALi, Ahmad, John, Shahzad, Siddique]
 * Print first element : ALi
 * Print last element : Siddique
 * Print before selective element[ALi, Ahmad]
 * Print from  selective element to end[John, Shahzad, Siddique]
 * ALi
 * John
 * Shahzad
 * Siddique
 */

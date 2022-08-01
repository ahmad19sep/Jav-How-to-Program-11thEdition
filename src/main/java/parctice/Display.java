package parctice;

import java.util.ArrayList;
import java.util.Arrays;

public class Display {
    public static void main(String[] args) {
     ArrayList<String> items=new ArrayList<String>();
     items.add("Ahmad");
     items.add(0,"Siddique");
     items.add(1,"Shaheen");
     items.add(2,"Shahzad");
     for (String i : items){
         System.out.println(i);
     }

     items.remove(3);
        for (String i : items){
            System.out.println(i);
        }
        System.out.println( items.contains ("Shahzad") ? "yes" : "No");
        System.out.println(items.size());
    }

}

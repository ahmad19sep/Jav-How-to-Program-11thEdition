package Ch7Arrays.java;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> colors=new ArrayList<String>();
        colors.add("green");
        colors.add("red");
        colors.add(0,"yellow");
        for (String i : colors){
            System.out.println(i);
        }
        System.out.println(colors.indexOf("red"));
        System.out.println(colors.indexOf("green"));
           colors.remove("green");
        for (String i : colors){
            System.out.println(i);
            System.out.println(colors.indexOf("red"));
        }
        System.out.println(colors.contains("yellow"));
        System.out.println(colors.contains("green"));
        System.out.println(colors.size());
        colors.clear();
    }


}

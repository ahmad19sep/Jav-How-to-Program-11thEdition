package Ch7Arrays.java;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class SplitString {
    public static void main(String[] args) {


        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter values With commas \",\"");
        String values=scanner.nextLine();
        String[] s=values.split(",");
        int [] array=new int[10];
        for (int i=0;i<s.length; i++){

            array[i]=Integer.parseInt(s[i]);

        }
        System.out.println(Arrays.toString(array));
    }
}

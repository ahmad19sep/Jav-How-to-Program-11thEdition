package Hacker.java;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        int j=3;
        int g=3;
        int k=6;
        k=g+1;
        int l=1;
        if (j <=3  || k < 3){
            System.out.println(j);
        }
        System.out.println(g > 4  ? "true" : "false");
        int[][] array=new int[5][5];
        Arrays.stream(array).forEach(a -> Arrays.fill(a, 9));
        for (int[] i:array){
            for (int m : i){
                System.out.print(" "+m);
            }
            System.out.println();
        }
    }

}

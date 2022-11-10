package Ch16GenericCollections;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;



public class ArrayDequeue {

    public static void main(String[] args) {
        ArrayDeque<String> deque=new ArrayDeque();


    }
}


 class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String A=sc.next();
            String B=sc.next();
            System.out.println((A.length()+B.length()));
       int a=A.compareTo(B);
        System.out.println(a<1 ? "No" : "Yes");

       String s=A.substring(0,1).toUpperCase();
       String s1=B.substring(0,1).toUpperCase();
        System.out.println(s+A.substring(1)+" "+s1+B.substring(1));


A.toUpperCase();


        }
}

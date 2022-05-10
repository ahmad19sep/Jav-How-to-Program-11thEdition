package Ch7Arrays.java;
import java.util.Scanner;
public class ArraysPractice {
    public static void main(String[] args) {
        final int ARRAY_LENGTH=10;
        int total=0;
        int arrey[]=new int[ARRAY_LENGTH];
        System.out.println("Index\t\tValue");
        for (int i=0;i<arrey.length; i++){
            arrey[i]=2+2*i;
            total+=arrey[i];
            System.out.println(i+"\t\t"+arrey[i]);
        }
        System.out.println("total"+total);
        int x=Math.max(2,3);
    }
}

package Ch7Arrays.java;

import java.util.Arrays;

//Arrays Functions
public class ClassArrays {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 2, 5, 7, 2, 9, 0};
        Arrays.sort(array);
        for (int i : array) {
            System.out.print(i);
        }
        System.out.println();
        int[] fillArray = new int[10];
        Arrays.fill(fillArray, 2);
        for (int i : fillArray) {
            System.out.print(i);
        }
        System.out.println();
        int []originalArray={1,4,23,5};
        int[] copyArray=new int[originalArray.length];
        System.arraycopy(originalArray,0,copyArray,0,originalArray.length);
        for (int i : copyArray) {
            System.out.print(i);
        }
        System.out.println();
        boolean compare=Arrays.equals(originalArray,copyArray);
        System.out.println(compare);
        boolean compare1=Arrays.equals(originalArray,fillArray);
        System.out.println(compare1);
        int value=Arrays.binarySearch(originalArray,1);
        int value1=Arrays.binarySearch(copyArray,233);
        System.out.println(value);
        System.out.println(value1);

    }
}

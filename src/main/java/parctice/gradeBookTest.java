package parctice;

import java.util.Arrays;

public class gradeBookTest {
    public static void main(String[] args){
    int[] array=new int[4];

    Arrays.fill(array,5);
      int[] copyArray={12,3,5,6,5};
      int[] copy=new int[copyArray.length];
      System.arraycopy(copyArray,0,copy,0,copyArray.length);

    }

}

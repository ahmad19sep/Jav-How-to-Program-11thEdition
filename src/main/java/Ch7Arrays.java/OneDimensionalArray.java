package Ch7Arrays.java;

import java.security.SecureRandom;
import java.util.Arrays;

public class OneDimensionalArray {
    public static void main(String[] args) {
        SecureRandom random=new SecureRandom();
        int[] arrays={2,4,6,4,7,4,6,3,2,1,5,4,3,2};
        System.out.println("Original Value"+Arrays.toString(arrays));
        for (int i=0; i<arrays.length; i++){
            if (i > 4 && i < 10 ){
                int value=arrays[i];
                arrays[i]=value*2;
            }
        }
        System.out.println("Modified Values"+Arrays.toString(arrays));

        int[] salary=new int[10];
       Arrays.fill(salary,500);

        System.out.println("500 Values"+Arrays.toString(salary));
int[] score = new int[100];
       for (int i=0; i<score.length; i++){
           int a=random.nextInt(45);
           score[i]=a;
       }int a=0;
       for (int i : score){
           a++;
           System.out.print(" "+i+" ");
           if(a%2==0){
               System.out.println();

           }

       }
    }
}

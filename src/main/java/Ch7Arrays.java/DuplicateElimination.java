package Ch7Arrays.java;

import java.security.SecureRandom;
import java.util.Arrays;

public class DuplicateElimination {
    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        int[] array = {2, 4, 6, 4, 6, 5, 4, 1, 8, 7, 4};

        //  Arrays.fill(array, -1);
        /*for (int i = 0; i < 10; i++) {
            int a = 10 + random.nextInt(90);
            array[i] = {2,3,5,3,2,1,4,2,}

        }*/
        System.out.println("OriginalArray" + Arrays.toString(array));
        for (int j = 0; j < array.length; j++) {
            for (int k = j+1; k < array.length; k++) {

                    if (array[j] == array[k]) {
                        array[j] = -1;
                        break;
                    }
                }


        }
        for (int i: array){
            if (i!=-1){
                System.out.print(" "+i);
            }
        }

    }
}
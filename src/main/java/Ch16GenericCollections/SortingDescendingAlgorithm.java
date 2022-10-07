package Ch16GenericCollections;

import java.util.Arrays;

public class SortingDescendingAlgorithm {
    private static void sort(int[] a){
        for(int i=1; i<a.length; i++){
            for (int j=0; j<i; j++){
                if (a[j]<a[i]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;

                }
            }
        }
    }

    public static void main(String[] args) {
        int a[]={2,5,76,79,5,54,67,865,89,7666,54};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
}

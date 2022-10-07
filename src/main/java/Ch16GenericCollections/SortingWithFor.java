package Ch16GenericCollections;

import java.util.Arrays;

public class SortingWithFor {
    private static void sort(int[] a){
        for (int i=1; i<a.length;i++){

            for (int j=0; j<i; j++){
                if (a[j]>a[i]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int a[]={3,43,3,2,42,42,42,42,425,2432,43,2,4,4};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
}

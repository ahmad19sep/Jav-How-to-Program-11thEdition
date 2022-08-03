package parctice;



import java.util.ArrayList;
import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the sum: ");
        int sum=input.nextInt();
        int count=0;
        ArrayList<Integer> list =new ArrayList<>();
        for (int j=sum; j>1; j--){
            boolean checker=true;
        for (int i=j/2; i>=2; i--) {
            if (j % i == 0) {
               checker=false;
               break;
            }
        }
            if (checker){
                count++;

                list.add(j);
            }
            }
            ArrayList<Integer> list1 = new ArrayList<>(list);
        for (int i : list1){
            for (int j : list){
                if (i+j==sum){
                    System.out.println("Number "+sum+" is a sum of two\nprime Numbers " +
                            "which is "+i+" "+j);
                }
            }
        }

        }
    }


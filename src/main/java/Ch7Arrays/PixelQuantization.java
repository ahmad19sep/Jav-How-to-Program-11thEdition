package Ch7Arrays.java;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Scanner;

public class PixelQuantization {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        SecureRandom random=new SecureRandom();
        System.out.print("Enter the number of pixels in a row: ");
       int []arrays=new int[scanner.nextInt()];
        for (int i=0; i<arrays.length; i++ ){
            int a=random.nextInt(9);

           arrays[i]=a;

        }
        System.out.println(Arrays.toString(arrays));
        for (int i=0; i<arrays.length; i++){
            if (i <= 20){
                arrays[i]=10;
            }
             else if (i <= 40){
                 arrays[i]=30;
            }
             else if (i <= 60){
                 arrays[i]=50;
            }
             else if (i <= 80){
                arrays[i]=70;
            }
            else if (i <= 100){
                arrays[i]=90;
            }
            else if (i <= 120){
                arrays[i]=110;
            }
            else if (i <= 140){
                arrays[i]=130;
            }
            else if (i <= 160){
                arrays[i]=150;
            }
            else if (i <= 180){
                arrays[i]=170;
            }
            else {
                arrays[i]=190;
            }
        }
        System.out.println(Arrays.toString(arrays));

    }
}

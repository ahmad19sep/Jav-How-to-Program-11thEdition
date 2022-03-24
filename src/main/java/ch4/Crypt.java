package ch4;

import java.util.Scanner;

public class Crypt {

        public static void main(String[] args) {
            int sum = 0;
            int num1=0;
            int num2=0;

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your Number: ");
            int number = scanner.nextInt();
            for (int i = 1; i <= 4; i++) {
                int rem = number % 10;
                number = number / 10;
                rem +=7;
                num1 =rem%10;
                sum =sum*10+num1;

            }
            int rem1=sum%10;
            sum=sum/10;
            int rem2=sum%10;
            sum=sum/10;
            int rem3=sum%10;
            sum=sum/10;
            int rem4=sum%10;
            int encrytped =0;
            encrytped =((encrytped*10)+(rem2));
            encrytped =encrytped*10+rem1;
            encrytped=encrytped*10+rem4;
            encrytped=encrytped*10+rem3;
            System.out.println("encrypted form " +encrytped);

            //decrypted form

            System.out.print("Enter encrypted: ");
            int encrypted=scanner.nextInt();
            int enc1=encrypted%10;
            encrypted=encrypted/10;
            int enc2=encrypted%10;
            encrypted=encrypted/10;
            int enc3=encrypted%10;
            encrypted=encrypted/10;
            int enc4=encrypted%10;
            int descrypted=0;
            descrypted =descrypted*10+enc2;
            descrypted=descrypted*10+enc1;
            descrypted=descrypted*10+enc4;
            descrypted=descrypted*10+enc3;
            System.out.println("d"+descrypted);
            int desForm=0;

            for(int i=1; i<=4; i++){
                int des1=descrypted%10;
                des1=(des1+10)-7;
                descrypted=descrypted/10;
                desForm=(desForm*10)+des1;
            }
            System.out.println(" ");
            System.out.println("decrypted form"+desForm);

        }

    }



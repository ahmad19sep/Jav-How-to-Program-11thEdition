package ch2InputOutput;

import java.util.Scanner;

public class SepDig {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=scanner.nextInt();
        int mod1 = num % 10;
        int div = num / 10;

        int mod2 = div % 10;

        int div1 = div / 10;
        int mod3 = div1 % 10;
        int div2 = div1 / 10;
        int mod4 = div2 % 10;
        int div3 = div2 / 10;
        int mod5 = div3 % 10;
        System.out.printf("%d  %d %d %d %d", mod5, mod4, mod3, mod2, mod1);
        System.out.println();

        int x=0;

        System.out.printf("%s      %s     %s%n","Number","Square","Cube");
        System.out.printf("%d            %d            %d%n",0,0,0);
        System.out.printf("%d            %d            %d%n",1,1*1,1*1*1);
        System.out.printf("%d            %d            %d%n",2,2*2,2*2*2);
        System.out.printf("%d            %d            %d%n",3,3*3,3*3*3);
        System.out.printf("%d            %d            %d%n",4,4*4,4*4*4);
    }
}

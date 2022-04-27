package ch6methods;
import java.util.Scanner;

public class test {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            sc.nextLine();
            System.out.printf("%2.2s\t\t%3.0d",s1,x);
        }
        System.out.println("================================");

    }
}

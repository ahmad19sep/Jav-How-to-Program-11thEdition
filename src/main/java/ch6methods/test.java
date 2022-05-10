package ch6methods;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class test {


    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
       /* for(int i=0;i<3;i++){
            String s1=sc.next();
            int x=sc.nextInt();
            sc.nextLine();
            System.out.printf("%2.2s\t\t%3.0d",s1,x);

        }*/
        System.out.println("================================");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
        for(int i=1; i<=10; i++){
            System.out.printf("%d * %d = %d%n",N,i,N*i);
        }
        for(int i=1; i<=10; i++){
            System.out.printf("%d*%d=%d%n",N,i,N*i);
            //System.out.println(N+" * "+i+" = "+N*i);
        }
    }
}




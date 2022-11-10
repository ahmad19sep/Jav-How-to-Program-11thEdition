package DynamicProgramming;

public class PrintNUmRecursion {
    private static void   printNum(int n, int a, int sum){
        if (a==n){
            sum+=n;
            System.out.println(sum);
            return;
        }

        sum+=a;
        printNum(n,a+1,sum);

    }
    public static void main(String[] args) {
        int n=5;
        printNum(5,1,0);
    }
}

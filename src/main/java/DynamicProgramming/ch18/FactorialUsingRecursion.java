package DynamicProgramming.ch18;

public class FactorialUsingRecursion {
    private static void factCalculator(int num, int fact){
        if (num<=1){
            System.out.printf("%s: %d","Factorial is ",fact);
            return;
        }

        factCalculator(num-1,fact*num);
    }

    public static void main(String[] args) {
        factCalculator(5,1);

        System.out.printf("%n%s : %d","Factorial is",fact(5));
    }
    //Another type of factorial using recursion

    private static long fact(long num){
        if (num<=1) return 1;
        else return num*fact(num-1);
    }

}

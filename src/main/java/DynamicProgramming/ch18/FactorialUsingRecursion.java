package DynamicProgramming.ch18;

public class FactorialUsingRecursion {
    private static void factCalculator(int num, int fact){
        if (num==1){
            System.out.printf("%s: %d","Factorial is ",fact);
            return;
        }
        fact*=num;
        factCalculator(num-1,fact);
    }

    public static void main(String[] args) {
        factCalculator(6,1);
    }
}

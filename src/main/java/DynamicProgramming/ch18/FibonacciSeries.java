package DynamicProgramming.ch18;

public class FibonacciSeries {
    private  static int fib(int num){
        if(num<=2)  return 1 ;
        else return fib(num-1)+fib(num-2);
    }
    public static void main(String[] args) {
        System.out.printf("Fibonacci of %d is: %d",6,fib(40));
    }
}

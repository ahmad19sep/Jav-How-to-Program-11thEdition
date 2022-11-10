package DynamicProgramming.ch18;

import java.util.HashMap;
import java.util.List;

public class FibonacciSeries {

    private  static Long fib(int n, HashMap<Integer,Long> memo){
        if (memo.containsKey(n)) return memo.get(n);
        if(n<=2)  return 1L ;
        memo.put(n,(fib(n-1, memo)+fib(n-2,memo)));
        return memo.get(n);
    }
    public static void main(String[] args) {
        HashMap<Integer,Long> memo = new HashMap<>();
        System.out.printf("Fibonacci of %d is: %d",50,fib(50,memo));
        System.out.println("");
    }
}

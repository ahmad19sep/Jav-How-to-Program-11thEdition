package DynamicProgramming.ch18;


import java.util.HashMap;
import java.util.Scanner;

public class DimensionWays {
    private static int ways(int x, int y, HashMap<String, Integer> memo) {
        String key = x + " " + y;
        if (memo.containsKey(key)) return memo.get(key);
        if (x <= 1 || y <= 1) return 1;
        memo.put(key, ways(x - 1, y, memo) + ways(x, y - 1, memo));
        return memo.get(key);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> memo = new HashMap<>();
        try {
            int x, y;
            x = scanner.nextInt();
            y = scanner.nextInt();
            System.out.println(x > 0 && y > 0
                    ? ("Number of ways to reach the buttom = " + ways(x, y, memo))
                    : "Enter positive number");

        } catch (RuntimeException e) {
            System.out.println("Enter valid input");
        }

    }
}
/**
 * Input x=30, y=10
 * output
 * Number of ways to reach the bottom = 163011640
 */
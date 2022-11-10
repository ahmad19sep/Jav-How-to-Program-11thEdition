package DynamicProgramming.ch18;

public class TargetSum {
    private static boolean canSum(int targetSum, int[] num) {
        if (targetSum == 0) return true;
        if (targetSum < 0) return false;
        for (int j : num) {
            int rem = targetSum - j;
            if (canSum(rem, num))
                return true;

        }
        return false;
    }

    public static void main(String[] args) {
        int[] num = {3, 1};
        System.out.println(canSum(7, num));

    }
}

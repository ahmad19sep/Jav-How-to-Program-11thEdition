package GoogleKickStart;

import java.util.Scanner;

public class SampleProblem {


    static int[] result;

    static void remainSweets(int N, int M, int rslt) {
        String sweets = input.nextLine();
        String[] arry = sweets.split(" ");
        int[] numOfSweets = new int[N];
        for (int i = 0; i < numOfSweets.length; i++) {
            numOfSweets[i] = Integer.parseInt(arry[i]);
        }
        int total = 0;
        for (int i : numOfSweets) {
            total += i;
        }
        result[rslt] = total % M;
    }


    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int T = input.nextInt();
        input.nextLine();
        result = new int[T];

        for (int i = 0; i < T; i++) {
            String value = input.nextLine();
            methodCall(value, i);
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println("Case #" + i + ": " + result[i]);
        }

    }

    public static void methodCall(String value, int i) {
        String[] array = value.split(" ");

        int[] a = new int[2];
        for (int ii = 0; ii < a.length; ii++) {
            a[ii] = Integer.parseInt(array[ii]);
        }
        remainSweets((a[0]), (a[1]), i);
    }
}

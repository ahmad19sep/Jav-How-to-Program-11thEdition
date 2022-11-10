package LambdasandStreamsch17.ch17Exerisce;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.IntStream;

public class GradesCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("press -1 at the end of grades");
        System.out.print("Enter Grades: ");
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> grades=new ArrayList<>();
        int ch = 0;
        while (true) {
            ch = input.nextInt();
            if (ch == -1)
                break;
            grades.add(ch);
            list.add(ch);

        }

        System.out.printf("Average: %.2f",  list.stream()
                .mapToDouble(x -> x)
                .average().getAsDouble());
      /*  int[] array={1,2,4,5,3,5,35,0,39,0};
        IntStream sorted = Arrays.stream(array).sorted(Comparator.reverseOrder()));
*/
        BinaryOperator<Integer> binaryOperator=Integer::sum;

    }
}

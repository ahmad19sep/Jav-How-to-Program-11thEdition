package ch6methods;
//Question
/*Write a method isMultiple that determines, for a pair
of integers, whether the second integer is a multiple of the first. The
method should take two integer arguments and return true if the second
is a multiple of the first and false otherwise. [Hint: Use the remainder
operator.] Incorporate this method into an application that inputs a series
of pairs of integers (one pair at a time) and determines whether the second
value in each pair is a multiple of the first.*/
import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        while (true){
            System.out.print("Enter the pair of integers: ");
            int num1=input.nextInt();
            int num2=input.nextInt();

            System.out.println(isMultiple(num1,num2)+" Pair");
            System.out.println("Press 'S' to stop function");

            if (input.next().charAt(0)=='s'){
                break;
            }
        }
    }
    public static boolean isMultiple(int num1, int num2){
        return num1 % num2 == 0;
    }
}

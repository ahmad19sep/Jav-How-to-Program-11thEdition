package LinkedIn;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        /* Scanner must  in main or static because in for loop with each execution
        Scanner object is created and it effects the performance of your program
         */
        Scanner input = new Scanner(System.in);
        // In this program we find greatest number in Array
        //We create a variable

        int greaterNumber = 0;
        /*
        It is much better if we take the array size from the user
         */
        System.out.print("Enter Array Size: ");
        int[] array = new int[input.nextInt()];

        // Now take the values from user and put in to the array
        //Remember Arrays start from index=0

        for (int i = 0; i < array.length; i++) {
            // In for loop we create our logic lets see
            array[i] = input.nextInt();

            if (array[i] > greaterNumber)
                greaterNumber = array[i];

        }
        //After the for loop we simply sout our greaterNumber lets see
        System.out.printf("GreaterNumber in Array : %d", greaterNumber);

    }
}
/*
Result
Enter Array Size: 5
Array Elements: 2 4 7 5 3
GreaterNumber in Array : 7
(:

 */

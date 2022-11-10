package ExceptionHandling;

import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.lang.Exception;

public class DivisionBZeroExceptionHandling {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);



                System.out.print("Enter numerator: ");
                int numerator = input.nextInt();
                System.out.print("Enter denomenaotr: ");
                int denomenator = input.nextInt();


                System.out.println(DivisionByZero(numerator, denomenator));


        }




    public static int DivisionByZero(int num1, int num2) throws  ArithmeticException{
        if(num2==0)
            throw new ArithmeticException("Invalid denomentar ");

        return num1 / num2;


    }
}

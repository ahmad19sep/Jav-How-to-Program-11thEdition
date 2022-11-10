package ExceptionHandling;

import java.util.Scanner;

public class FinallyExceptiion {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        try {int m=throwException();
        int n=input.nextInt();

        }catch (Exception e){
            System.err.println("error");
        }

    }
    public static int throwException()  throws Exception {
       try {

             System.out.println("Creating Exception" ) ;
            throw new Exception();
             }catch (Exception e){
             System.out.println("Thrown exception");
              // throw e;
        }
         finally {
           System.out.println("Finally method");
       }
return 8;
    }}


package parctice;
import java.util.Scanner;
public class IfElse {
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter Student Name : ");
        String userName=input.nextLine();
        System.out.print("Enter Student Number: ");
        int num=input.nextInt();
        if (num > 0 && num<=32){
            System.out.println("Fail");
        }
        else if ( num <=50){
            System.out.printf("%s%n","C grade");
        }
        else if( num <=70) {
            System.out.printf("%s%n", "B pass");
        }
            else{
              System.out.printf("%s","A pass");
            }
            System.out.printf("%s",(num > 32 ? "Pass" : "fail"));
        }

    }


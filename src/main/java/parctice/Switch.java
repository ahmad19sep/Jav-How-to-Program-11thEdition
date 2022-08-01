package parctice;
import java.util.Scanner;
public class Switch {
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter student Number: ");
        int num=input.nextInt();
        switch(num/10){
            case 4:
                System.out.println("Student passed Need So much effort");
                break;
            case 9:
                System.out.println("Execllent ");
                break;
            case 5:
                System.out.println("Student passed Not very well");
                break;
            case 7:
                System.out.println("Average Student \"Passed\"");
                break;
            default:
                System.out.println("fail");
        }
    }
}

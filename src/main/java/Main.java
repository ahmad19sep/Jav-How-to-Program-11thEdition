import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HeartRates human1=new HeartRates("Ahmad","Siddique",19,9,2001);
        human1.heartBeat();
        Scanner scanner=new Scanner(System.in);
        System.out.print("\n");
        System.out.print("Enter your First Name: ");
        String firstNAme=scanner.nextLine();
        System.out.print("Enter your Last Name: ");
        String lastName=scanner.nextLine();
        System.out.println("Enter the date of birth");
        System.out.print("Enter day: ");
        int day=scanner.nextInt();
        System.out.print("Enter Month: ");
        System.out.print("\n");
        int month=scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter year: ");
        int year=scanner.nextInt();
        System.out.println("\n");
        HeartRates human2=new HeartRates(firstNAme,lastName,day,month,year);

        human2.heartBeat();
    }
}
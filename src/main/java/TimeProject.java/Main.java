package TimeProject.java;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        try {
            System.out.print("Enter current date: ");
        int date=scanner.nextInt();
        System.out.print("Enter current day: ");
        int day=scanner.nextInt();
        System.out.print("Enter current month: ");
        int month=scanner.nextInt();
        System.out.print("Enter current year: ");
        int year=scanner.nextInt();
        System.out.print("Enter current hour: ");
             int hour=scanner.nextInt();
        System.out.print("Enter current minute: ");
        int min=scanner.nextInt();
        System.out.print("Enter current second: ");
        int sec=scanner.nextInt();
        String f=scanner.nextLine();
        System.out.print("Enter time Format: ");
            String dayFormat=scanner.nextLine();



        Time pakistanTime=new Time();
        pakistanTime.setDate(date,month);
       // pakistanTime.setMonth(5);
        pakistanTime.setDays(day);
        pakistanTime.setHour(hour);
        pakistanTime.setMinute(min);
        pakistanTime.setTimeFormat(dayFormat);
        pakistanTime.setSecond(sec);
        pakistanTime.setYear(year);
pakistanTime.getTime();
    }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}

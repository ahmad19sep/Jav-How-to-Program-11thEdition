package ch6methods;

import java.security.SecureRandom;
import java.util.Scanner;

public class enumTypes {
    public enum days{
        MONDAY,TUESDAY,WEDNESDAY,THURSDAY,
        FRIDAY,SATURDAY,SUNDAY,INVALIDDATE;

    }
    static SecureRandom num=new SecureRandom();

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        while (true) {
            int date = 1 + num.nextInt(31);
            System.out.printf("Day on %d is\t%s%n", date, day(date));
            if (date==31){
                break;
            }
        }
    }
    public static days day(int date) {
        days ran0damDays;
        switch (date) {
            case 1:
            case 22:
            case 15:
            case 29:
                ran0damDays = days.FRIDAY;
                return ran0damDays;
            case 2:
            case 9:
            case 16:
            case 23:
            case 30:
                ran0damDays = days.SATURDAY;
                return ran0damDays;
            case 3:
            case 10:
            case 17:
            case 24:
                ran0damDays = days.SUNDAY;
                return ran0damDays;
            case 4:
            case 11:
            case 18:
            case 25:
                ran0damDays = days.MONDAY;
                return ran0damDays;
            case 5:
            case 12:
            case 19:
            case 26:
                ran0damDays = days.TUESDAY;
                return ran0damDays;
            case 6:
            case 13:
            case 20:
            case 27:
                ran0damDays = days.WEDNESDAY;
                return ran0damDays;
            case 7:
            case 14:
            case 21:
            case 28:
                ran0damDays = days.THURSDAY;
                return ran0damDays;
            default:
                return ran0damDays=days.INVALIDDATE;
        }

    }
}

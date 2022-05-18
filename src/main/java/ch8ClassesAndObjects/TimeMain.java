package ch8ClassesAndObjects;

public class TimeMain {
    public static void main(String[] args) {
        Time time1=new Time();
        try {


        time1.setTime(24,45,23);
        time1.UniversalTimeFormat();
        time1.standardTimeFormat();
    }catch (IllegalArgumentException e){
            System.out.printf("Execption: %s%n",e.getMessage());
        }
}}

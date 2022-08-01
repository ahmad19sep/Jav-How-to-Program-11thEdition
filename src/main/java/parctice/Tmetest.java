package parctice;

public class Tmetest {
    public static void main(String [] args){
        Time time=new Time(3,6,23);
        Time time1=new Time(3,34,38);
       /* try {
            System.out.println(  time.toUniversalString());
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }*/
        try {


            time.setTime(6, 4, 34);
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        System.out.println(displayTime(time));
        try {
            System.out.println(" t2 hour" + time1.getHour());
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
    private static String displayTime(Time t1){
       return String.format("%s%n%s%n%s%n%s","Universal Time",t1.toUniversalString(),
        "Standard Time",t1.timeFormat());

    }
}

package ch8ClassesAndObjects;

public class Time {
    private int hour;
    private int minute;
    private int second;
    public void setTime(int hour, int minute, int second){
        if (hour >= 0 && hour < 24  && minute >= 0 && minute <60 &&
                second >=0 && second < 60 ){
            this.hour=hour;
            this.minute=minute;
            this.second=second;
        }
        else {
            throw new IllegalArgumentException(
                    "Enter correct time"
            );
        }
    }
    public void UniversalTimeFormat(){
        System.out.printf("Universal Time: %02d:%02d:%02d %s%n%n",hour,minute,second,amPm());
    }
    public void standardTimeFormat(){
       int standardTime=hour%12;
        System.out.printf("Standard Time: %02d:%02d:%02d %s%n%n",standardTime,minute,second,amPm());
    }
    public String  amPm(){
        if (hour > 12 ){
            return "pm";
        }
        else {
            return "am";
        }
    }


}

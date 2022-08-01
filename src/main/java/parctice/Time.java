package parctice;

public class Time {
    private int min;
    private int sec;
    private int hour;

    public Time(int min, int sec, int hour) {
        if (hour < 0 || hour > 23 || min < 0 || min > 59 || sec < 0 || sec > 59) {
            throw new IllegalArgumentException(
                    "Invalid Values"
            );


        } else {
            this.hour = hour;
            this.min = min;
            this.sec = sec;
        }
    }
    public Time(Time t2){
        if ( hour < 0  || hour > 24  ){
            this.hour= t2.hour;
        }
        else {
            throw new IllegalArgumentException (" Invalid hour");
        }
    }
    public int getHour(){
        return hour;
    }

    public void setTime(int hour, int sec, int min) {
        if ((hour < 0 || hour > 23) || (min < 0 || min > 59) || (sec < 0 || sec > 59)) {
            throw new IllegalArgumentException("  Invalid values");

        }
        this.sec = sec;
        this.hour = hour;
        this.min = min;


    }

    public String toUniversalString() {
        return String.format("%02d:%02d:%02d",hour,min,sec);

    }
    public String timeFormat(){
        if (hour >= 12){
            hour=hour%12;
        }
        return String.format("%02d:%02d:%02d\t%s",hour,min,sec,(hour > 12 ? "pm" : "am"));
    }

}

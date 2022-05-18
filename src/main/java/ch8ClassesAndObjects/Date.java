package ch8ClassesAndObjects;

public class Date {
    private int year;
    private int month;
    private int day;
    int[] array={31,28,31,30,31,30,31,31,30,31,30,31};
    public Date(int year,int month, int day){

        this.year=year;
                if  (month < 1 || month > 12){
           throw new  IllegalArgumentException("month("+month+" out of range 1-12");

        }
                this.month=month;
                if (day > 0 && day<=array[month] && day!=array[1]+1){
                    this.day=day;
                }else if (month==2 && day==29 && year %4==0 && (year%100!=0 || year % 400 == 0)){
            this.day = day;
        }else {
                    throw new IllegalArgumentException(" Day'29'  out of range it is not a leap year "+year);
                }



    }
    public String toString(){
        return String.format("%02d/%02d/%d",month,day,year);
    }


}

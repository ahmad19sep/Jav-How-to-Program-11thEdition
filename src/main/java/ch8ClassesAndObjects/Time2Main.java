package ch8ClassesAndObjects;

public class Time2Main {
    public static void main(String[] args) {
        Time2 t1 = new Time2();
        Time2 t2 = new Time2(3);
        Time2 t3 = new Time2(3, 4);
        Time2 t4 = new Time2(15, 6, 23);
        Time2 t5 = new Time2(t4);
        try {
            Time2 t6= new Time2(3,6,34);
           displayTime("eee",t6);
        }catch (IllegalArgumentException e){
            System.out.println("www"+e.getMessage());
        }
        System.out.println("Constructors With Different Times");
        displayTime("Object t1:",t1);
        displayTime("Object t2:",t2);
        displayTime("Object t3:",t3);
        displayTime("Object t4:",t4);
        displayTime("Object t5:",t5);

    }
    public static void displayTime(String s, Time2 t){
        System.out.println(t.universalTime());
    }
}

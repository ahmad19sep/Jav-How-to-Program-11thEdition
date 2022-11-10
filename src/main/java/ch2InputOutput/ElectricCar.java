package ch2InputOutput;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class Automobile  {
   private final String drive() { return "Driving vehicle"; }
}
class Car extends Automobile {
    protected String drive() { return "Driving car"; }
}
public class ElectricCar extends Car {
    public final String drive() { return "Driving electric car"; }
    public static void main(String[] wheels) {
       // System.out.println(   new StringBuilder(1).insert(3, "own"));
        StringBuilder n=new StringBuilder();
        n.append("kkkk"); n.setLength(1);
        System.out.println(n);
        LocalDate d=LocalDate.now();
        d.withDayOfMonth(232);
        System.out.println(d);
    }
}
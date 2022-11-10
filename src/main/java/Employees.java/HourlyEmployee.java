package Employees.java;

import Employees.java.Employee;
import ch8ClassesAndObjects.Date;

public class HourlyEmployee extends Employee {
    private int wage;
    private int hours;

    public HourlyEmployee(String firstName, String lastName, String cnic, int phNumber, int wage, int hours, Date db) {
        super(firstName, lastName, cnic, phNumber,db);
        if (wage < 0 && hours < 0){
            throw new IllegalArgumentException("Invalid values");
        }
        this.wage = wage;
        this.hours = hours;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }
    @Override
    public String earnings() {

    return String.format("%s : %f","Total Salary",(hours < 41 ? (wage*hours) : ((wage*hours)+(hours-40)*1.5)));
    }
          public String toString(){
        return String.format("%s%n%s ",super.toString(),earnings());
          }


}

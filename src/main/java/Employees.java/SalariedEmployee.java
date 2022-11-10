package Employees.java;

import Employees.java.Employee;
import ch8ClassesAndObjects.Date;

public class SalariedEmployee extends Employee {
    private int weeklySalary;

    public SalariedEmployee(String firstName, String lastName,
                            String cnic, int phNumber, int weeklySalary,
                            Date dob) {
        super(firstName, lastName, cnic, phNumber, dob);
        if (weeklySalary < 0) {
            throw new IllegalArgumentException("Invalid Salary");
        }
        this.weeklySalary = weeklySalary;
    }

    public int getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(int weeklySalary) {
        this.weeklySalary = weeklySalary;
    }

    @Override
    public String earnings() {
        return String.format("Weekly salary : %s", weeklySalary);
    }

    @Override
    public String toString() {
        return weeklySalary +
                 super.toString() ;
    }
}

package LambdasandStreamsch17;

public class Employee {
    private String fastName;
    private String lastName;
    private double salary;
    private String department;

    public String getFastName() {
        return fastName;
    }

    public void setFastName(String fastName) {
        this.fastName = fastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Employee(String fastName, String lastName, double salary, String department) {
        this.fastName = fastName;
        this.lastName = lastName;
        this.salary = salary;
        this.department = department;

    }



    public String toString() {

       return String.format("%-8s %-8s %8.2f %8s %n",fastName,lastName,salary,department);
    }

}
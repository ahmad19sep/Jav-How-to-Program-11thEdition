package Employees.java;

import ch8ClassesAndObjects.Date;

public class CommissionEmployee extends Employee {
    private int commissionSalary;


    public CommissionEmployee(String firstName, String lastName,
                              String cnic, int phNumber, int commissionSalary, Date db) {
        super(firstName, lastName, cnic, phNumber,db);
        if (commissionSalary < 0) {
            throw new IllegalArgumentException("Invalid salary");
        }
        this.commissionSalary = commissionSalary;

    }

    private double calculateCharityShare(int commissionSalary) {
        return 0.25 * commissionSalary;
    }

    public void setCommissionSalary(int commissionSalary) {
        this.commissionSalary = commissionSalary;
    }

    public int getCommissionSalary() {
        return this.commissionSalary;
    }

    @Override
    public String toString() {
        return commissionSalary +
                "} " + super.toString() + "CommissionEmployee{" +
                "commissionSalary=";
    }

    @Override
    public String earnings() {
        return String.format("%s", commissionSalary);
    }
}

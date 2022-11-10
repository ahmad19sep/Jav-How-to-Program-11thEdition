package Employees.java;

import ch8ClassesAndObjects.Date;

public class BasePlusCM extends CommissionEmployee {
private int baseSalary;

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public BasePlusCM(int baseSalary, String firstName, String lastName, String cnic, int phNumber, int commissionSalary, Date db){
    super(firstName,lastName,cnic,phNumber,commissionSalary,db);
    if (baseSalary < 0){
        throw new IllegalArgumentException("Invalid values");

    }
    this.baseSalary=baseSalary;
}

    @Override
    public String toString(){
        return String.format("%s%n%s : %s",super.toString(),"baseSalary",getBaseSalary());
}
@Override
    public String earnings(){
        return String.format("%s : %s ","BaseSalary",(getBaseSalary()+super.earnings()));
}
}

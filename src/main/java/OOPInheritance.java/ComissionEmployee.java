package OOPInheritance.java;

public class ComissionEmployee extends Employee{

    private int commissionSalary;
    private int grossSales;
    public ComissionEmployee(String firstName,String lastName,String securityNumber
    , int commissionSalary,int grossSales ){
        super(firstName,lastName,securityNumber);
        this.commissionSalary=commissionSalary;
        this.grossSales=grossSales;

    }


    public void setCommissionSalary(int commissionSalary){
        this.commissionSalary=commissionSalary;
    }

    public int getCommissionSalary() {
        return commissionSalary;
    }

    public int getGrossSales() {
        return grossSales;
    }

    public void setGrossSales(int grossSales){
        this.grossSales=grossSales;
    }
    public int earnings(){
        return getCommissionSalary() * getGrossSales();
    }
    public String toString(){
      return String.format("%s%n%s = %s %n %s =%s",super.toString(),"Gross sales",getGrossSales(),
              "Salary ",commissionSalary);
}}

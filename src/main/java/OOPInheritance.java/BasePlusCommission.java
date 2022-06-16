package OOPInheritance.java;

public class BasePlusCommission  extends ComissionEmployee{
    private int baseSalary;

    public BasePlusCommission(String firstName,String lastName,String securityNumber
            , int commissionSalary,int grossSales ){
        super(firstName,lastName,securityNumber,commissionSalary,grossSales);
    }
    public void setBaseSalary(int baseSalary){
        this.baseSalary=baseSalary;
    }
    public int getBaseSalary(){
        return this.baseSalary;
    }

    @Override
    public int earnings() {
        return  super.earnings() *getBaseSalary();
    }

    @Override
    public String toString() {
        return "BasePlusCommission{" +
                "baseSalary=" + baseSalary +
                "} " + super.toString();
    }
}

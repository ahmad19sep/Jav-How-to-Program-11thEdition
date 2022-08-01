package parctice;

public class BasePlusCommissionSalary extends CommissionEmplyoee {
    private int commissionSalary;
    public BasePlusCommissionSalary(int commissionSalary,String name, String phoneNumber,
                                    String securityNumber, int baseSalary){
        super(name,  phoneNumber,  securityNumber,  baseSalary);
        if (commissionSalary < 0){
            throw new IllegalArgumentException("Invalid Salary");

        }
        this.commissionSalary=commissionSalary;
    }

    public void setCommissionSalary(int commissionSalary) {
        this.commissionSalary = commissionSalary;
    }

    public int getCommissionSalary() {
        return commissionSalary;
    }
    @Override
    public String toString(){
        return String.format("%s%n%s : %d",super.toString(),"Commission Salary",commissionSalary);

    }


}

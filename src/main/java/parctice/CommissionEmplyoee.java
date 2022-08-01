package parctice;

public class CommissionEmplyoee extends Object {
    private String name;
    private String phoneNumber;
    private String securityNumber;
    private int baseSalary;

    public CommissionEmplyoee(String name, String phoneNumber, String securityNumber, int baseSalary) {
        if (baseSalary < 0) {
            throw new IllegalArgumentException("invalid salary");
        }
        this.baseSalary = baseSalary;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.securityNumber = securityNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSecurityNumber() {
        return securityNumber;
    }

    public void setSecurityNumber(String securityNumber) {
        this.securityNumber = securityNumber;
    }

    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }
    public int totalEarnings(){
        return baseSalary;
    }
    public String toString(){
        return String.format("%s : %s%n%s : %s%n%s : %s%n%s : %d","Name",
                name,"PhoneNumber",phoneNumber,"Security Number",securityNumber,"Salary",baseSalary);
    }
}

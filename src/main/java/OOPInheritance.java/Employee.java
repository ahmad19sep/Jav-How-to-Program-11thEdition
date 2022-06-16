package OOPInheritance.java;

public class Employee {
    private final String firstName;
    private final String lastName;
    private final String securityNumber;

    public Employee(String firstName, String lastName, String securityNumber) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.securityNumber = securityNumber;
    }
    public String getFirstName() {
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getSecurityNumber(){
        return this.securityNumber;
    }

    public String toString(){
        return String.format("%s-%s%n %n%s: %s",getFirstName(),getLastName(),
                "SecurityNumber",getSecurityNumber() );
    }
}

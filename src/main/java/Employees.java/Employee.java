package Employees.java;

import ch8ClassesAndObjects.Date;
import parctice.interfaces.Payable;

public abstract class  Employee implements Payable {
private String firstName;
private String lastName;
private String cnic;
private int phNumber;
private Date birthDate;

public Employee(String firstName,String lastName,String cnic,int phNumber, Date dob){
    this.cnic=cnic;
    this.firstName=firstName;
    this.lastName=lastName;
    this.phNumber=phNumber;
    this.birthDate=dob;
}

    public String getFirstName() {
        return firstName;
    }
public Date getBirthDate(){
    return this.birthDate;
}
    public String getLastName() {
        return lastName;
    }


    public String getCnic() {
        return cnic;
    }

    public int getPhNumber() {
        return phNumber;
    }
    public String toString(){
    return String.format("%s : %s%n%s : %s%n%s : %s%n%s : %d%n%s :%s","First Name",firstName,"LastName",
            lastName,"CNIC",cnic,"PhoneNumber",phNumber,"Date of Birth",birthDate);
    }

    public abstract String earnings();

    @Override
    public String getAmount() {
        return   (earnings());
    }
}


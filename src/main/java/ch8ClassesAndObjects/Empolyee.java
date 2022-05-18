package ch8ClassesAndObjects;

public class Empolyee {
    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private Date hiredDate;

    public Empolyee(String firstName, String lastName, Date dateOfBirth,
                    Date hiredDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.hiredDate = hiredDate;
    }
    public String toString(){
      return String.format  ("Name: %s %s%nDate Of Birth: %s%nHired Date: %s%n",
              lastName,firstName,dateOfBirth,hiredDate);


    }
}

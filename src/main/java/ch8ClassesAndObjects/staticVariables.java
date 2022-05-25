package ch8ClassesAndObjects;

public class staticVariables {
    private static int count;
    private String firstName;
    private String lastName;
    public staticVariables(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
        ++count;
        System.out.printf("%-10s %d: %-10s%10s","Employee",count,firstName,lastName);

    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
}

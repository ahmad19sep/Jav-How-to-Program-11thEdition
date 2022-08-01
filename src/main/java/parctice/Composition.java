package parctice;

public class Composition {
    private String name;
    private String lastName;
    private int rollNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        if (rollNo < 0 || rollNo >1000){
            throw new IllegalArgumentException("Invalid RollNo Numbers");
        }
        this.rollNo = rollNo;
    }

    public Composition(String name, String lastName, int rollNo) {
        this.name = name;
        this.lastName = lastName;
        if (rollNo < 0 || rollNo >1000) {
            throw new IllegalArgumentException("Enter Valid rollNo");
        }
        this.rollNo = rollNo;
    }
    public String toString(){
        return String.format("%s:%s%n%d%n","Name",name+lastName,rollNo);
    }
}

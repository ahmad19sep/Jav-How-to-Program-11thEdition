package ch8ClassesAndObjects;

public class EmpolyeeDateTest {
    public static void main(String[] args) {
        try {


            Date dateOfBirth = new Date(2001, 2, 29);
            Date dateOfHired = new Date(2021, 10, 12);
            Empolyee empolyee1 = new Empolyee("Ahmad", "Siddique",
                    dateOfBirth, dateOfHired);
            System.out.println(empolyee1);
        }catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
    }
}

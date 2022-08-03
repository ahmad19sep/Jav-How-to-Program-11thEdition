package parctice;

public class Validation {
    private int age;
    private String name;
    public Validation(int age, String name){
        if (ageChecker(age)){
            this.age=age;
        }
        this.name=name;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (ageChecker(age)) {
            this.age = age;
        }
    }
    public static boolean ageChecker(int age){
        if (age < 20 || age > 30 ){
         throw new IllegalArgumentException("Invalid age");
        }
        return true;
    }
}

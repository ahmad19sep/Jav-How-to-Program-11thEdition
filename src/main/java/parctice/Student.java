package parctice;

public class Student {
    private String name;
    private int rollNo;
    private char grades;

    public Student(String name, int rollNo, char grades) {
        this.name = name;
        this.rollNo = rollNo;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public char getGrades() {
        return grades;
    }

    public void setGrades(char grades) {
        this.grades = grades;
    }

    @Override
    public String toString(){
        return "[name:"+name+"]";
    }
}

package Ch16GenericCollections;

import org.jetbrains.annotations.NotNull;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student>{
    int age;
    int idNumber;
    String name;

    public Student(int age, int idNumber, String name) {
        this.age = age;
        this.idNumber = idNumber;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", idNumber=" + idNumber +
                ", name='" + name + '\'' +
                '}';
    }

     @Override
     public int compareTo(@NotNull Student student) {
         return this.getAge()-student.getAge();
     }
 }
  class Comperable {
     public static void main(String[] args) {
         Student std1=new Student(34,2345,"ALi");
         Student std3=new Student(90,8743,"sharif");
         System.out.println("***** Single object compare *****");
         System.out.println( std1.compareTo(std3));
         System.out.println("***//-List sorting with Comparable-//***");
         List <Student> list=new ArrayList<>();
         list.add(new Student(23,432,"John"));
         list.add(new Student(21,6564,"English"));
         list.add(new Student(43,755,"Bean"));
         list.add(new Student(12,33333,"Mr"));
         Collections.sort(list);
         for (Student student : list)
         System.out.println("\n"+student);

     }


 }
/**
 * ***** Single object compare *****
  -56
 *** -List sorting with Comparable- ***
        Student{age=12,idNumber=33333,name='Mr'}
        Student{age=21,idNumber=6564,name='English'}
        Student{age=23,idNumber=432,name='John'}
        Student{age=43,idNumber=755,name='Bean'}
 */




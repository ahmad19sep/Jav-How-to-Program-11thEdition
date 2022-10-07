package Ch16GenericCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparingEmployees {
    public static void main(String[] args) {
        Employee[] employees=new Employee[4];
        employees[0]=new Employee("Ali",34,4000);
                employees[1]=new Employee("Ahmad",24,4030);
                        employees[2]=new Employee("Amina",55,403230);
                                employees[3]=new Employee("Ibrahim",4,4333000);


        List<Employee> list=new ArrayList<>();
        list.add(new Employee("Ali",34,4000));
        list.add(new Employee("Ahmad",24,4030));
        list.add(new Employee("Amina",55,403230));
        list.add(new Employee("Ibrahim",4,4333000));
        System.out.println("*****************Printing Unsorting array***************");
        for (Employee employee : list){
            System.out.println(employee);
        }
        System.out.println("*****************************************************");
        System.out.println("After Sorting the Employee List using  age");
       Collections.sort(list,new ComparatorTest());

        for (Employee employee : list) {
            System.out.println(employee);
        }
        System.out.println("********************************************************");
        System.out.println("After Sorting the Employee List using  Name");
        Collections.sort(list,new ComparatorTest1());

        for (Employee employee : list) {
            System.out.println(employee);
        }
        System.out.println("*******************************************************");
        System.out.println("After Sorting the Employee List using  salary");
        Collections.sort(list,new ComparatorTest2());
        for (Employee employee : list) {
            System.out.println(employee);
        }
    }
}

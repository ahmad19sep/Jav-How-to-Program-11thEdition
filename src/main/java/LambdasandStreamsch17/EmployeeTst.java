package LambdasandStreamsch17;

import LinkedIn.Array;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EmployeeTst {
    public static void main(String[] args) {
       Employee[] employees= {new Employee("Ali", "raza", 40000, "CS"),
               new Employee("Ahmad", "Siddique", 50000, "CS"),
               new Employee("Umar", "Nasir", 20000, "CS"),
               new Employee("Shahzad", "Siddique", 780808, "AI"),
               new Employee("Asad", "reham", 780844, "AI"),
               new Employee("Yasin", "Ahmad", 808300, "Software Development"),
               new Employee("Nabeel", "Ahmad", 2130203, "Software Development"),
               new Employee("Abbas", "Watto", 104000, "Software Development"),
               new Employee("Abid", "Ali", 100030, "SEO"),
               new Employee("Israr", "Ahmad", 2534000, "SEO"),
               new Employee("Aleem", "Sheik", 30008, "SEO"),
       };

       List<Employee> list=Arrays.asList(employees);

        Map<String,List<Employee>> listMap=list.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        listMap.forEach((department,Emf)-> {
            System.out.printf("%-8s\n",department);
            double d=Emf.stream().mapToDouble(Employee::getSalary).average().getAsDouble();
            System.out.printf("%.2f\n",d);
        });




    }

}
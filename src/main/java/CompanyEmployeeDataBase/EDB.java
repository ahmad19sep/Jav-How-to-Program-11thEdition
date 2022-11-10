package CompanyEmployeeDataBase;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EDB {
    public static EmployeeData[] employees(){
        return new EmployeeData[]{
                new EmployeeData("ALi","Ahmad","CS",24,70000,2,"Development","Jounir"),
                new EmployeeData("Ahmad","Siddique","ISC",21,50000,1,"Development","Fresher"),
                new EmployeeData("Shahzad","Siddique","CS",29,1000000,9,"Mangement and Development","CEO"),
                new EmployeeData("Israr","Ahmad","CS",30,300000,4,"Seo","Head of Seo "),
                new EmployeeData("Huzaif","amjad","CS",29,400000,5,"Automation","Senior Tester"),
                new EmployeeData("Ashia","QA","CS",32,100000,3," Testing","Senior Tester"),
                new EmployeeData("Umar","Nasir","CS",25,60000,2,"Development","Fresher"),
                new EmployeeData("Wahja","gor","CS",35,250000,6,"Technical Recuriter","Senoir"),
                new EmployeeData("john","alley","Matric",34,20000,10,"Cleaning","Senior"),
                new EmployeeData("Mr","Bean","Nothing",54,70000,20,"Security","Professional"),
                new EmployeeData("Shahzad","Siddiuqe","CS",29,900000,9,"Mangement and Development","CEO"),





        };
    }
    public static Predicate<? super EmployeeData> predicate(){
        return x->x.getSalary()<=100000 && x.getSalary()>=10000;
    }

    public static void main(String[] args) {
        List<EmployeeData> list= Arrays.asList(employees());
        System.out.println("********Employees who earn 10000$-100000$***********");
        list.stream().filter(predicate()).forEachOrdered(System.out::println);
        //First person who earns 10000+ salary
        System.out.println("---------First person who  earns 10000+ salary---------");
        list.stream()
                .filter(predicate())
                .findFirst()
                .ifPresent(System.out::println);
//Sorting the Employees By First Name and By last Name
        System.out.println("***** Sorting the employee by first name and by last name *********");
        Function<EmployeeData,String> emp= EmployeeData::getFirstname;
        Function<EmployeeData,String> emp1= EmployeeData::getLastName;

        // Creating comparator
        Comparator<EmployeeData> employeeDataComparator=Comparator.comparing(emp1)
                .thenComparing(emp).
                thenComparing(EmployeeData::getSalary);
        list.stream().sorted(employeeDataComparator).forEach(System.out::println);
        System.out.println();
        System.out.println("** Employees Whose Last name same **");


        list.stream()
                .map(EmployeeData::getLastName)
                .distinct()
                .sorted()
                .forEach(System.out::println);

        list.stream().filter(x->x.getDepartment().equals("Development")).forEach(System.out::println);
        System.out.println("*************************");
        Map<String,List<EmployeeData>> gbd=
                list.stream()
                        .collect(Collectors.groupingBy(EmployeeData::getDepartment));
        gbd.forEach(
                (dp,eIm)->{
            System.out.printf("%n%s%n",dp);
            eIm.forEach(e -> System.out.printf("  %s%n", e));


        });

        Map<String, Long> m=
                list.stream()
                        .collect(Collectors.groupingBy(EmployeeData::getDepartment,Collectors.counting()));
       m.forEach((d,c)->{
           System.out.println(d+" has "+c+" emp");
       });
        System.out.println(list.stream().mapToDouble(EmployeeData::getSalary).sum());
        System.out.println(list.stream().mapToInt(EmployeeData::getAge).average());


    }
}

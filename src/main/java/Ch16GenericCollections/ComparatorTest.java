package Ch16GenericCollections;

import java.util.Comparator;

public class ComparatorTest implements Comparator<Employee> {
    @Override
    public int compare(Employee emp1, Employee emp2) {
        return emp2.getAge() - emp1.getAge();
    }
}
class ComparatorTest1 implements Comparator<Employee>{
    @Override
    public int compare(Employee emp1,Employee emp2){
        return emp1.getName().compareTo(emp2.getName());
}}
    class ComparatorTest2 implements Comparator<Employee> {
        @Override
        public int compare(Employee emp1, Employee emp2) {
            return (int) ( emp1.getSalary() - emp2.getSalary());
        }
    }




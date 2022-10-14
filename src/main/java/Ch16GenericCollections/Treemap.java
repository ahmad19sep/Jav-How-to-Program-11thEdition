package Ch16GenericCollections;

import java.util.TreeMap;

class Employee1{
    String name;
    int securityNumber;

    public Employee1(String name, int securityNumber) {
        this.name = name;
        this.securityNumber = securityNumber;
    }

    @Override
    public String toString() {
        return "Employee1{" +
                "name='" + name + '\'' +
                ", securityNumber=" + securityNumber +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSecurityNumber() {
        return securityNumber;
    }

    public void setSecurityNumber(int securityNumber) {
        this.securityNumber = securityNumber;
    }
}
public class Treemap {
    public static void main(String[] args) {
        TreeMap<Integer,String> treeMap=new TreeMap();
        treeMap.put(299,"ALi");
        treeMap.put(213,"Ahmad");
        treeMap.put(543,"Asad");
        treeMap.put(546,"Nabeel");
        treeMap.put(333,"Siddique");
        treeMap.put(77,"Farooq");
        System.out.println(treeMap);
    }
}

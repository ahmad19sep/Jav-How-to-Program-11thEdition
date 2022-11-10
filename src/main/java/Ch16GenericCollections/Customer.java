package Ch16GenericCollections;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    String name;
    boolean isAcHolder;
    public Customer(String name, boolean isAcHolder) {
        this.name = name;
        this.isAcHolder = isAcHolder;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", isAcHolder=" + isAcHolder +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAcHolder() {
        return isAcHolder;
    }

    public void setAcHolder(boolean acHolder) {
        isAcHolder = acHolder;
    }
}
class Application{
    List<Customer> customers=new ArrayList<>();
    public void addCustomer(Customer c){
        customers.add(c);
    }
    public boolean isEmpty(){
        return customers.isEmpty();
    }
    public Customer serveCustomer(){
        Customer c=null;
        for (int i=0; i<customers.size(); i++){
     if (customers.get(i).isAcHolder()){
         c=customers.remove(i);
         return c;

     }
    }
        return customers.remove(0);


    }
}
class Test2{
    public static void main(String[] args) {
        Application app=new Application();
        app.addCustomer(new Customer("Ali",true));
        app.addCustomer(new Customer("Ahmad",false));
        app.addCustomer(new Customer("Shahzad",true));
        if (!app.isEmpty()){
            Customer c=app.serveCustomer();
            System.out.println(c);
        }
        app.addCustomer(new Customer("Siddique",true));
        if (!app.isEmpty()){

            Customer c=app.serveCustomer();
            System.out.println(c);
        }
        if (!app.isEmpty()){

            Customer c=app.serveCustomer();
            System.out.println(c);
        }
        if (!app.isEmpty()){

            Customer c=app.serveCustomer();
            System.out.println(c);
        }
    }

}

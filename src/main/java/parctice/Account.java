package parctice;

public class Account {
    private String name;
    private double balance;
    public Account(String name,double balance){
        this.name=name;
        if (balance > 0.0){
            this.balance=balance;
        }
    }
    public void depositBalance(double deposit){
        this.balance +=deposit;
    }
    public double getBalance(){
        return this.balance;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
}

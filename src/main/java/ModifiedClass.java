public class ModifiedClass {
    private  String name;
    private  double balance;
    public  ModifiedClass(String name,double balance){
        this.balance=balance;
        this.name=name;
    }
    public void  withDraws(double money){
        if(balance>=money){
            this.balance=balance-money;
            System.out.println(this.name);
            System.out.printf("WithDrawAmountIs=%.2f%n",money);
            System.out.println("Current Amount In Your Account is = "+this.balance);
        }
        else {
            System.out.println(this.name);
            System.out.println("No enough balance in Account Please deposit some money in" +
                    "the account "+"\n so in certain conditions you withdraw the money Thanks:)");
            System.out.printf("Your Current Amount is=%.2f%n",this.balance);
        }
    }
}

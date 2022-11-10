package parctice;

import parctice.interfaces.Invoice;
import parctice.interfaces.Payable;

public class TestPayable {
    public static void main(String[] args) {
        Payable a,b;
        a=new Invoice(45,67);

        System.out.println( a.getAmount());
    }
}

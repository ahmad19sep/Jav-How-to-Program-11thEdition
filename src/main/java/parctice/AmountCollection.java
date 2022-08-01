package parctice;
import  java.math.*;
import java.text.NumberFormat;
public class AmountCollection {
    public static void main(String[] args) {
        BigDecimal amount = BigDecimal.valueOf(2343234);
        BigDecimal montlyCost = BigDecimal.valueOf(100000);
        amount = amount.add(montlyCost);
        System.out.println(NumberFormat.getCurrencyInstance().format(amount));


    }}
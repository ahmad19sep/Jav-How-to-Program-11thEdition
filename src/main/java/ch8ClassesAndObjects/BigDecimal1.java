package ch8ClassesAndObjects;
import java.math.BigDecimal;
import java.text.NumberFormat;

public class BigDecimal1 {
    public static void main(String[] args) {
        BigDecimal money=BigDecimal.valueOf(1000.0455776);
        BigDecimal interestRate=BigDecimal.valueOf(0.055667876);
        for (int i =1; i <=10; i++){
            BigDecimal totalAmount=money.multiply(interestRate.add(BigDecimal.ONE).
                    pow(i));
            System.out.printf("%-4d%20s%n", i,NumberFormat.getCurrencyInstance().format(totalAmount));
        }
    }
}

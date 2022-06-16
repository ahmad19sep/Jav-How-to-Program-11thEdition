package OOPInheritance.java;

public class LoanMain {
    public static void main(String[] args) {
        CarLoan carLoan=new CarLoan(30,9000);
        System.out.println( carLoan.getMonthlyInstallment());
    }
}

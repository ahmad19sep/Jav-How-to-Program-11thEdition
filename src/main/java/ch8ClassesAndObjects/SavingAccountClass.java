package ch8ClassesAndObjects;

public class SavingAccountClass {
     static int annualInterestRate;
    private int savingsAccount;

    public SavingAccountClass(int savingsAccount) {
        this.savingsAccount = savingsAccount;

    }

    public void setSavingsAccount(int monthlyInterest) {
        this.savingsAccount += monthlyInterest;
    }

    public int getSavingsAccount() {
        return this.savingsAccount;
    }

    public int calculateMonthlyInterest() {
        return (savingsAccount*annualInterestRate)/12;

    }
    public static void setAnnulInterestRate(int interestRate){

        annualInterestRate=interestRate;
    }


}

package ch5Switch;

public class SwitchMain {
    public static void main(String[] args) {
        AutoSwitch policy1=new AutoSwitch("MA",34344,"Toyota Gli");
        AutoSwitch policy2=new AutoSwitch("AY",356543,"Honda City");

        faultState(policy1);
        faultState(policy2);

    }

    public static void faultState(AutoSwitch policy){
        System.out.println("The auto policy");
        System.out.printf("%s: %d%n%s: %s%n","Account Number",policy.getAccountNumber(),
                "Car Model",policy.getCarModel());
        System.out.printf(" State   %s %s no fault state%n%n", policy.getState(),policy.isNoFault()?" is":" is not");

    }
}

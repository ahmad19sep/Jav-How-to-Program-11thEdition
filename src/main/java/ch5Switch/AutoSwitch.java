package ch5Switch;

public class AutoSwitch {
    private String state;
    private int accountNumber;
    private String carModel;
    public AutoSwitch(String state,int accountNumber,String carModel){
        this.state=state;
        this.accountNumber=accountNumber;
        this.carModel=carModel;
    }
    public void setState(String state){
        this.state=state;
    }
    public String getState(){
        return this.state;
    }
    public void setAccountNumber(int accountNumber){
        this.accountNumber=accountNumber;
    }
    public int getAccountNumber(){
        return this.accountNumber;
    }
    public void setCarModel(String carModel){
        this.carModel=carModel;
    }
    public String  getCarModel(){
        return this.carModel;
    }
    public boolean isNoFault(){
        boolean noFaultState;
        switch (getState()){
            case "MA":
                case "PL":
                    case "AY":
                        case "IC":
                            noFaultState=true;
                            break;
            default:
                noFaultState=false;
                break;
        }
        return noFaultState;
    }
}

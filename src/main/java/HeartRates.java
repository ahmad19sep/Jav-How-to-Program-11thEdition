public class HeartRates {
    private String firstName;
    private String lastName;
    private int day;
    private int month;
    private int year;
    public HeartRates(String firstName,String lastName,int day,int month, int year){
        this.day=day;
        this.year=year;
        this.lastName=lastName;
        this.month=month;
        this.firstName=firstName;
    }

    public int getDay() {
        return day;
    }
    public void setDay(int day){
        this.day=day;
    }
    public int getYear(){
        return  year;

    }
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    public void setYear(int year){
        this.year=year;

    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public void setMonth(int month){
        this.month=month;

    }
    public int getMonth(){
        return this.month;
    }
    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public void ageYear(){
        if(day>15){
            this.month++;
        }
        if(month>6){
            this.year--;
        }
    }

    public void heartBeat(){
        int currentAge=2022-this.year;
        System.out.println(currentAge);
        int maxRng=220-currentAge;
        int targetZone=(maxRng*50)/100;
        int targetZone70=(maxRng*70)/100;
        System.out.printf("Name: %s %s%n",firstName,lastName);
        System.out.println("Maximum HeartBeat = "+maxRng );
        System.out.printf("Target HR Zone(50-70) %d-%d",targetZone,targetZone70);
    }

}
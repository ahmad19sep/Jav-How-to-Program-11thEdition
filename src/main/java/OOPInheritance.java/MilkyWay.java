package OOPInheritance.java;

public class MilkyWay extends Universe{
    private String solarSystem;
    public MilkyWay(String solarSystem,String universe){
        super(universe);
        this.solarSystem=solarSystem;
    }

    @Override
    public String toString() {
        return solarSystem+" "+super.toString();
    }
}

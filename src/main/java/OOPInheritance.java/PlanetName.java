package OOPInheritance.java;

public class PlanetName extends MilkyWay {
    private String planetName;
    public PlanetName(String planetName,String solarSystem,String universe){
        super(solarSystem,universe);
        this.planetName=planetName;
    }

    @Override
    public String toString() {
        return planetName+" " +super.toString();
    }
}

package OOPInheritance.java;

public class CountryName extends PlanetName {
    private String countryName;
    public CountryName(String countryName,String universe,String solarSystem,String planetName){
        super(universe,solarSystem,planetName);
        this.countryName=countryName;
    }

    @Override
    public String toString() {
        return countryName+" "+super.toString();
    }
}

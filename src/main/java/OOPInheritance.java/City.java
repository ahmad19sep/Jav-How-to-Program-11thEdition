package OOPInheritance.java;

public class City extends CountryName{
    private String city;
    public City(String city,String countryName,String universe,String solarSystem,String planetName){
        super(universe,solarSystem,planetName,countryName);
        this.city=city;
    }

    @Override
    public String toString() {
        return city+" " +super.toString();
    }
}

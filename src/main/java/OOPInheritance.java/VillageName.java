package OOPInheritance.java;

public class VillageName extends City {
    private String villageName;

    public VillageName(String villageName, String city, String countryName, String universe, String solarSystem, String planetName) {
        super(universe, solarSystem, planetName, countryName, city);

        this.villageName = villageName;
    }
    public String getVillageName(){
        return this.villageName;
    }

    @Override
    public String toString() {
        return villageName+" " +super.toString();
    }
}


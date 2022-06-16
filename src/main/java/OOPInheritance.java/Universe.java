package OOPInheritance.java;

public class Universe {
    private String universe;
    public Universe(String universe){
        this.universe=universe;
    }

    @Override
    public String toString() {
        return universe+" ";
    }
}

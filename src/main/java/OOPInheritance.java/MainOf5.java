package OOPInheritance.java;

public class MainOf5 {
    public static void main (String [] args){
        VillageName villageName1=new VillageName("KANIPUR",
                "BASIRPUR","PAKISTAN","WORLD",
                "MILKYWAY","EARTH");
        System.out.printf("%s%n%s","Address of my home",
                villageName1.toString());
    }
}

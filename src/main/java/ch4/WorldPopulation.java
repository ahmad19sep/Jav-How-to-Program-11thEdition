package ch4;

public class WorldPopulation {
    public static void main(String[] args) {
        long population=8000000000L;
        System.out.println("Year\t\t\tTotal Population\t\tPopulation increased per year");
        for (int i=2022; i<=2097; i++){
            population+=(population*(1.5))/100;
            long eachYear= (long) ((population*(1.5))/100);
            System.out.println(i+"\t\t\t"+population+"\t\t\t\t\t"+eachYear);
        }
    }
}

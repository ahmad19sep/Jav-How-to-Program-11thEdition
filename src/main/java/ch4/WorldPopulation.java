package ch4;

public class WorldPopulation {
    public static void main(String[] args) {

        long population=8000000000L;
        long nextPopulation=population*2;
        long nextPopulation1=(long) nextPopulation+120000000;
        int doublePopulation=0;
        System.out.println("Year\t\t\tTotal Population\t\tPopulation increased per year");
        for (int i=2022; i<=2097; i++){
            population+=(population*(1.5))/100;
            long eachYear= (long) ((population*(1.5))/100);
            System.out.println(i+"\t\t\t"+population+"\t\t\t\t\t"+eachYear);
            if(population >= nextPopulation && population <=nextPopulation1  ){
               doublePopulation=i;
            }

        } System.out.println("In "+doublePopulation+" population is double");
    }
}

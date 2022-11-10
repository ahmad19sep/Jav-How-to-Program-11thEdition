package Ch16GenericCollections;

import java.util.*;

public class CollectionTest16Fig {
    public static void main(String[] args) {
        // Using ArrayList
// List No 1 cities of pakistan
        List<String> list=new ArrayList<>();
        String[] cities={"Lahore","Islambad","Karachi","Multan","Kasur","Quatea"};
        list.addAll(Arrays.asList(cities));

        //List N0 2 punjab
        List<String> punjabCities=new ArrayList<>();
        String[] pc={"Basirpur","Deplapur","Okara", "Lahore","kasur"};
        punjabCities.addAll(Arrays.asList(pc));
        removePunjabCities(punjabCities,list);
        System.out.println(list);


    }
    public final static void removePunjabCities(Collection l1,Collection l2){
      Iterator<String> iterator=l2.iterator();

        while (iterator.hasNext()){

            if (l1.contains(iterator.next())){
                iterator.remove();
            }
        }
    }
}

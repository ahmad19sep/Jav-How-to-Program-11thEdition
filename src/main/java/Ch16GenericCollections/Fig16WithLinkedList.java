package Ch16GenericCollections;

import java.util.*;

public class Fig16WithLinkedList {
    public static void main(String[] args) {
        String[] cities={"Lahore","Islambad","Karachi","Multan","Kasur","Quatea"};
        String[] pc={"Basirpur","Deplapur","Okara", "Lahore","kasur"};

        List<String> pkCities=new LinkedList<>();
        pkCities.add(Arrays.toString(cities));
        List<String> pbCities=new LinkedList<>(Arrays.asList(pc));

        for (String c : pc){
pbCities.add(c);
        }


        ListIterator<String> iterator1=pbCities.listIterator(pbCities.size());
        while (iterator1.hasPrevious()){
            System.out.print(iterator1.previous());
        }

    }
    private void removeFunction(List<String> a1,List<String> a2){
        ListIterator<String> iterator= a1.listIterator();
        while (iterator.hasNext()){
           if (a2.contains(iterator.next())){
               iterator.remove();
           }


        }
    }
}

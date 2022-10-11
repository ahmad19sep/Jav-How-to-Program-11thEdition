package Ch16GenericCollections;

import java.util.HashMap;
import java.util.Map;

public class hashMap {
    public static void main(String[] args) {
        // We now learn the use of hashMap
        //hash map take pair 1st: key 2nd value
        HashMap<Integer,String> map=new HashMap<>();
        //For insertion "put" function is used
        map.put(6934,"Ahmad Siddique");
        map.put(6423,"Ali Raza");
        map.put(6932,"Ali Abbas");
        map.put(6423,"Muneeb");
        // Two keys are same so the latest key will be updated
      //Print out all the entries
        System.out.println(map);
        // In the output you can see Ali Raza replace with Muneeb
        //Check weather the value is present or not if present print value if not print message
        System.out.println(map.getOrDefault(6934, "Key is not present"));
        System.out.println(map.getOrDefault(4332,"Key is not present"));
        //Contains method
        System.out.println(map.containsValue("ALi") ? "true" : "false");
        //get Method
        System.out.println(map.get(6923));
        //Print all values one by one
        for (Map.Entry<Integer,String> e : map.entrySet()){
            System.out.println(e);
        }

    }
    /**
     * output-:
     * {6932=Ali Abbas, 6934=Ahmad Siddique, 6423=Muneeb}
     * Ahmad Siddique
     * Key is not present
     * false
     * null
     * 6932=Ali Abbas
     * 6934=Ahmad Siddique
     * 6423=Muneeb
     */
}

package Ch16GenericCollections;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class GenericClass<E> {
    private ArrayList<E> arrayList=new ArrayList<>();
    public void push(E push){
        arrayList.add(push);
    }
    public E pop(){
       if (arrayList.isEmpty()){
           throw new NoSuchElementException("No elements found");

       }else {
           return arrayList.remove(arrayList.size()-1);
       }

       }
       public int size(){
        return arrayList.size();
       }


}
class Test{
    public static void main(String[] args) {
        GenericClass<Integer> genericClass=new GenericClass<>();
        genericClass.push(4);
        genericClass.push(5);
        genericClass.push(34);
        genericClass.push(2222);

     int size= genericClass.size();
        for (int i=0; i<size; i++){
            System.out.println(genericClass.pop());
        }
}}
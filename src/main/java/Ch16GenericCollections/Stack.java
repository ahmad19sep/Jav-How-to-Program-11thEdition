package Ch16GenericCollections;

import java.util.ArrayList;

public class Stack <E> {
    private ArrayList<E> data=new ArrayList<>();
    public void pushData(E value){
        data.add(value);
    }
    public E popData(){
        if (data.isEmpty()){
            throw new RuntimeException("STACK IS EMPTY");
        }
        else {
            return data.remove(data.size()-1);
        }
    }
    public int  size(){
        return data.size();
    }
}
class Test1{
    public static void main(String[] args) {
        /*int[] integer={2,4,6,7,3,6,2,6};
        double[] realNum={3.5,56.6,23.5,35.65,5.767,77.54};
        String[] name={"ALi","Ahmad","Shahzad","Siddique","Amina","Asad"};
        char[] alpa={'a','b','d','c','e','r','t'};*/
        /**
         * Integer type stack
         */
        Stack<Integer> stack=new Stack<>();
        stack.pushData(4);
        stack.pushData(34);
        stack.pushData(56);
        /**
         * String type stack
         */
        Stack<String> stack1=new Stack<>();
        stack1.pushData("ALi");
        stack1.pushData("Shahzad");
        stack1.pushData("Umar");
        /**
         * Character type stack
         */
        Stack<Character> stack2=new Stack<>();
        stack2.pushData('a');
        stack2.pushData('v');
        stack2.pushData('c');
        /**
         * Double type stack
         */
        Stack<Double> stack3=new Stack<>();
        stack3.pushData(3.5);
        stack3.pushData(65.3);
        stack3.pushData(22.1);
int size=stack.size();
        System.out.println("Integer Stack");
        for (int i=0; i<size; i++){
            System.out.print(stack.popData()+" ");
        }
        System.out.println("\nString Stack");
        for (int i=0; i< size; i++){
            System.out.print(stack1.popData()+" ");
        }
        System.out.println("\nDouble Stack");
        for (int i=0; i< size; i++){
            System.out.print(stack3.popData()+" ");
        }
        System.out.println("\nCharacter Stack");
        for (int i=0; i< size; i++){
            System.out.print(stack2.popData()+" ");
        }
    }
}
/**
 * OutPut:
 * Integer Stack
 * 56 34 4
 * String Stack
 * Umar Shahzad ALi
 * Double Stack
 * 22.1 65.3 3.5
 * Character Stack
 * c v a
 */

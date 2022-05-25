package ch8ClassesAndObjects;

public class MainStatic {
    public static void main(String[] args) {
        staticVariables employee1=new staticVariables("shahzad","siddique");
        staticVariables em2=new staticVariables("Ahmad","Siddique");
        System.out.println(em2.getFirstName());
    }
}

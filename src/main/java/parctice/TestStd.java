package parctice;

public class TestStd {
    public static void main(String[] args) {
        Composition std=new Composition("Ali","Ahmad",4);
        StudentData std1=new StudentData("Al-Basir","I-2",std);
        System.out.println(std1.toString());
    }
}

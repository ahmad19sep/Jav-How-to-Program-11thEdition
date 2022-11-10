package ch10OOP;

public class TestMobile {
    public static void main(String[] args) {
        Tv a=new Mobile("hj","d",45);
        Mobile.size="3443";
        System.err.println(Mobile.size);
        System.err.println(Tv.size);
        System.out.println( a.screen());
    }
}

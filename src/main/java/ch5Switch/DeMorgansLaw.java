package ch5Switch;

public class DeMorgansLaw {
    public static void main(String[] args) {
        int x=5;
        int y=8;
        int a=5;
        int g=8;
        int b=9;
        System.out.println(!(x<5)&&!(y>=7));
        System.out.println(!((x < 5)||(y>=7)));
        System.out.println(!(a==b)||!(g!=5));
        System.out.println(!((a==b)&&(g!=5)));
    }
}

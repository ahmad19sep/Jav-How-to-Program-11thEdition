package ch4;

public class Dangling {
    public static void main(String[] args) {
        int a=3;
        int b=4;
        if(a<3)
            if (b >= 4)
                System.out.println("hello");
            else
                System.out.println("Else 2");
        else
            System.out.println("IfElse 1");
    }
}

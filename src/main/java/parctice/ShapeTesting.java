package parctice;

public class ShapeTesting {
    public static void main(String[] args) {
        Shape a,b;
        a=new Circle(23,4);
        b=new Rectangle(5,6);
        System.out.println(a.toDraw());
        System.out.println(b.toDraw());
        System.out.println();
        System.out.println();
        Rectangle c = (Rectangle) b;
       System.out.println(c.length());

    }
}

package OOPInheritance.java;

public class Shapes {
    public static void main(String[] args) {


        Rectangle r1 = new Rectangle(3, 5);
        System.out.println(r1.draw());
        System.out.println();


        Circle c1 = new Circle(4);
        System.out.println(c1.draw());
        System.out.println();

        Triangle t1 = new Triangle(3, 5, 5);
        System.out.println(t1.draw());

        System.out.println("*******************************************");
        Shape s1=new Triangle(4,6,7);
        System.out.println(s1.draw());

        s1=new Circle(32);
        System.out.println(s1.draw());

        s1=new Rectangle(4,78);
        System.out.println(s1.draw());
    }
}

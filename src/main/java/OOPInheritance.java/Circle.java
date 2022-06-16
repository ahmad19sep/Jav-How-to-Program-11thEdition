package OOPInheritance.java;

public class Circle  extends Shape{
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String draw() {
        return String.format("%s%n%s = %d", "This is a cricle", "Radius ", getRadius());
    }
}

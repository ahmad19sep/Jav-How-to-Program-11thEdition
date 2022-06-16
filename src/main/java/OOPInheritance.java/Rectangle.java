package OOPInheritance.java;

public class Rectangle  extends Shape{
    private int length;
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

/*    public String draw() {
        return String.format("This is a Rectangle%n%s = %d %n %s = %d", "Length", getLength(),
                "Width", getWidth());
    }*/
}

package parctice;

public class Circle extends Shape {
    private int radius;

    public Circle(int radius, int size ) {
        super(size);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public double area(){
        return Math.PI*Math.pow(radius,2);
    }
    @Override
    public String toDraw(){
        return "Circle used to draw round shapes ";
    }
}

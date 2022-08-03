package parctice;

public class Rectangle  extends Shape{
    private int corners;


    public Rectangle(int size, int corners) {
        super(size);
        this.corners = corners;
    }

    public int getCorners() {
        return corners;
    }

    public void setCorners(int corners) {
        this.corners = corners;
    }
    public int length(){
        return corners*4;
    }
    @Override
    public String toDraw(){
        return "Rectangle used to draw plots";
    }
}

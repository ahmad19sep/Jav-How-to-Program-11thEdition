package OOPInheritance.java;

public class Triangle  extends Shape{
    private int hypo;
    private int height;
    private int base;

    public Triangle(int height, int hypo, int base) {
        this.base = base;
        this.height = height;
        this.hypo = hypo;

    }

    public int getBase() {
        return base;
    }

    public int getHeight() {
        return height;
    }

    public int getHypo() {
        return hypo;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setHypo(int hypo) {
        this.hypo = hypo;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String draw() {
        return String.format("%s%nHeight = %d%n Base = %d%n Hypo = %d%n",
                "This is a triangle", getHeight(), getBase(), getBase());
    }
}

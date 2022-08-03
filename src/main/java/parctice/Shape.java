package parctice;

public  abstract class Shape {
    private  int size;

    public Shape(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
    public  abstract String toDraw();
}

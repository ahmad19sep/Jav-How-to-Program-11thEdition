package ch8ClassesAndObjects;

public class cylinder {
    private double radius=1;
    private double height=1;
    public cylinder(){

    }
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public void setHeight(double height){
        this.height=height;
    }
    public double getHeight(){
        return this.height;
    }
    public double getVolume(){
        return (Math.PI*Math.pow(radius,2)*height);
    }
}

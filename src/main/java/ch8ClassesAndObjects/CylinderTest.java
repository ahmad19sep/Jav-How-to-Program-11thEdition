package ch8ClassesAndObjects;

public class CylinderTest {
    public static void main(String[] args) {
        cylinder boxVolume=new cylinder();
        boxVolume.setRadius(2);
        boxVolume.setHeight(4);
        System.out.printf("The volume of Box is: %.2f meterCube",boxVolume.getVolume());
    }
}

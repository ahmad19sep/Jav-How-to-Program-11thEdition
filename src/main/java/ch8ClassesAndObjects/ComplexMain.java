package ch8ClassesAndObjects;

import TimeProject.java.Main;

public class ComplexMain {
    public static void main(String[] args) {
        ComplexNumber obj1=new ComplexNumber();
        ComplexNumber obj2=new ComplexNumber(3,5);
        obj1.setFirstRealNumber(2);
        obj1.setSecondImgNumber(3);
        addTwoNumbers(obj1,obj2);
        System.out.println(Math.sqrt(4));

    }
    public static void addTwoNumbers(ComplexNumber obj1, ComplexNumber obj2){
       float realPrat=obj1.getFirstRealNumber()+ obj2.getFirstRealNumber();
       float imgPart=obj2.getSecondImgNumber()+ obj1.getSecondImgNumber();
        System.out.printf("RealPart: %.2f ImgPart: %.2f",realPrat,imgPart);
    }
}

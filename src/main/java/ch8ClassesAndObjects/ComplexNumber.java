package ch8ClassesAndObjects;

public class ComplexNumber {
    private float firstRealNumber;

    private float secondImgNumber;


    public ComplexNumber(){

    }
    public ComplexNumber(int firstRealNumber,int secondImgNumber){
        this.firstRealNumber=firstRealNumber;
        this.secondImgNumber=secondImgNumber;

    }
    public void setFirstRealNumber(int realNumber){
        this.firstRealNumber=realNumber;
    }




    public void setSecondImgNumber(int imgNumber){
        this.secondImgNumber=imgNumber;

    }

    public float getFirstRealNumber() {
        return firstRealNumber;
    }

    public float getSecondImgNumber() {
        return (float) (secondImgNumber*(Math.sqrt(-1)));
    }
}

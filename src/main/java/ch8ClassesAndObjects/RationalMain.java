package ch8ClassesAndObjects;

import ch6methods.GCD;

import java.util.Scanner;

public class RationalMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ///////////////////////////////////////////////////////////////////////////////////////////////////////////

        System.out.println("******Fraction-1************");

        System.out.print("Numerator: ");
        int numerator = scanner.nextInt();
        System.out.print("Denominator: ");
        int denominator = scanner.nextInt();
        int smallestNum1 = (Math.min(numerator, denominator));
        int greatestCommonDiv1 = 1;
        greatestCommonDiv1 = greatestCM(smallestNum1, denominator, numerator, greatestCommonDiv1);

        //NEW DM AND NM **************************************************

        int newNumerator = numerator / greatestCommonDiv1;

        int newDenominator = denominator / greatestCommonDiv1;
        //**********************fraction 2************************************

        ///////////////////////////////////////////////////////////////////////////////////////////////////////

        ////////////////////////////////////////////////////////////////////////////////////////////////////////
        System.out.println("***********Fraction-2***********************");
        System.out.print("Numerator: ");
        int numerator1 = scanner.nextInt();
        System.out.print("Denominator: ");
        int denominator1 = scanner.nextInt();
        int smallestNum2 = (Math.min(numerator, denominator));
        int greatestCommonDiv2 = 1;
        greatestCommonDiv2 = greatestCM(smallestNum2, denominator1, numerator1, greatestCommonDiv2);


        int newNumerator1 = numerator1/ greatestCommonDiv2;

        int newDenominator1 = denominator1 / greatestCommonDiv2;

        //*********************************************************************************
        RationalNumbers obj1 = new RationalNumbers(newNumerator, newDenominator);

        RationalNumbers obj2 = new RationalNumbers(newNumerator1, newDenominator1);
        /////////////////USER CHOICE////////////////////////////////////////////////////////////////////
        System.out.print("Press 'a' for Addition: ");
        System.out.print("Press 's' for Subtraction: ");
        System.out.print("Press 'd' for Division: ");
        System.out.print("Press 'm' for Multiplication: ");
        if (scanner.next().charAt(0)=='a') {
            addRationalNum(obj1, obj2);
        }
        else if (scanner.next().charAt(0)=='s') {
            subRationalNum(obj1, obj2);
    }
        else if (scanner.next().charAt(0)=='d') {
         //   divRationalNum(obj1, obj2);
        }
        else if (scanner.next().charAt(0)=='m') {
           mulRationalNum(obj1, obj2);
        }
    }

//*************************************Add Two Fractions***************************************
    ////////////////start///////////////////////////////////////////////////////////////////////

    public static void addRationalNum(RationalNumbers obj1, RationalNumbers obj2) {

        int SMNum = Math.min(obj1.getDenominator(), obj2.getDenominator());
        int GCD = 1;
        GCD = greatestCM(SMNum, obj1.getDenominator(), obj2.getDenominator(), GCD);
        int LCM = ((obj1.getDenominator() / GCD) * (obj2.getDenominator()) / GCD) * GCD;
        int numerator = ((LCM / obj1.getDenominator()) * (obj1.getNumerator()) + ((LCM / obj2.getDenominator()) * (obj2.getNumerator())));
        GCD = 1;
        int smlNum = Math.min(LCM, numerator);
        GCD = greatestCM(smlNum, LCM, numerator, GCD);
        int originalNumerator = numerator / GCD;
        int originalDenominator = LCM / GCD;
        System.out.printf("%d / %d + %d / %d = %d / %d ", obj1.getNumerator(), obj1.getDenominator(),
                obj2.getNumerator(), obj2.getDenominator(), originalNumerator, originalDenominator);

    }
    /////////////////end///////////////////////////////////////////////////////////////////////////
//***********************Greatest Common Div*************************************************************************
    public static int greatestCM(int smallestNum, int DM, int NM, int GCD) {
        while (smallestNum > 1) {
            if (NM % smallestNum == 0 && DM % smallestNum == 0) {
                GCD = smallestNum;
                smallestNum--;
            } else {

                smallestNum--;
            }

        }
        return GCD;
        //////////////////////////////////////////////////////////////////////////////////////////

    }


    ////////////////start///////////////////////////////////////////////////////////////////////

    public static void subRationalNum(RationalNumbers obj1, RationalNumbers obj2) {

        int SMNum = Math.min(obj1.getDenominator(), obj2.getDenominator());
        int GCD = 1;
        GCD = greatestCM(SMNum, obj1.getDenominator(), obj2.getDenominator(), GCD);
        int LCM = ((obj1.getDenominator() / GCD) * (obj2.getDenominator()) / GCD) * GCD;
        int numerator = ((LCM / obj1.getDenominator()) * (obj1.getNumerator()) - ((LCM / obj2.getDenominator()) * (obj2.getNumerator())));
        GCD = 1;
        int smlNum = Math.min(LCM, numerator);
        GCD = greatestCM(smlNum, LCM, numerator, GCD);
        int originalNumerator = numerator / GCD;
        int originalDenominator = LCM / GCD;
        System.out.printf("%d / %d - %d / %d = %d / %d ", obj1.getNumerator(), obj1.getDenominator(),
                obj2.getNumerator(), obj2.getDenominator(), originalNumerator, originalDenominator);

    }
    /////////////////end///////////////////////////////////////////////////////////////////////////
//**
    public static void divRationalNum(){

    }
    ///////////////////////////////////////////////////////////////////////////////////////////////////////////

    public static void mulRationalNum(RationalNumbers obj1, RationalNumbers obj2){
        int denominator= obj1.getDenominator()* obj2.getDenominator();
        int numerator=obj1.getNumerator()*obj2.getNumerator();
        int GCD=1;
        int smlNum=Math.min(denominator,numerator);
       GCD= greatestCM(smlNum,denominator,numerator,GCD);
       numerator=numerator/GCD;
       denominator=denominator/GCD;
        System.out.println("****************Product*****************");
        System.out.printf("%d /%d * %d / %d = %d / %d",obj1.getNumerator(),obj1.getDenominator(),
                obj2.getNumerator(),obj2.getDenominator(),numerator,denominator);

    }

}

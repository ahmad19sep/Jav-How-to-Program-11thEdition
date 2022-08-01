package parctice;

import java.lang.Math;

import static java.lang.Math.pow;

public class Static {
    static int fixNum=9;
    public static void main(String [] args){

        String name="Ali";
        System.out.println("Total sum is :"+addition(4,5));
    }
    public static int addition(int num,int ixNum){
        return fixNum + fixNum+num+ixNum;
    }
}

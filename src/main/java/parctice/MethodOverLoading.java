package parctice;

public class MethodOverLoading {

    public static void main(String [] args){
        int num=3;
        int num1=4;
        int num3=5;
        System.out.println(addition(num,num1));
        System.out.println(addition(num,num3,num1));
       System.out.println( MethodOverLoading.addition(num,num1));
       System.out.println(Math.pow(3,2));
    }
    public static int addition(int num,int num1){
        return num+num1;
    }
    public static int addition(int num, int num1, int num3){
        return num+num1+num3;
    }
}

package Hacker.java;

public class prime {

    public static void main(String[] args) {
        System.out.println(primeN(54));
    }
    public static int primeN(int num){

        boolean n=true;
        for (int i=2; i<=num/2; i++){
            if(num%i==0){
                n=false;
                break;

            }

        }


            if (n){

    }
        return num;
}
}
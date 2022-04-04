package ch5Switch;

public class LogicalOperators {
    public static void main(String[] args) {
        int a=2;
        boolean birthday=true;
        int b=8;
        b=a-b;
        if(birthday==false | b<=7){
            System.out.println(b);
            System.out.println(birthday);

        }
        if(b <= 6 & a>=1){
            System.out.println(a);
        }
        if(b > 3 ^ a>=3){
            System.out.println("^");
            System.out.println(a);
            System.out.println(b);
        }
    }

}

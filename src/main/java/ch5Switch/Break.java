package ch5Switch;

public class Break {
     static int e=2;
    static {
        int a;
    }
    public static void main(String[] args) {
        int count=0;
        for(int i=0; i<=10 && i!=5; i++){
            count=i;

            System.out.println(count);
        }
    }
}

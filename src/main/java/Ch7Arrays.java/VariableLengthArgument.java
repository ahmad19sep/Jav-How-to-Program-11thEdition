package Ch7Arrays.java;

public class VariableLengthArgument {
    public static double average(String name, double...numbers){
        double num=0;
        for (double i : numbers){
            num+=i;
        }
        return num/numbers.length;

    }
    public static void main(String[] args) {
        System.out.println(average("ali",2.3,4.2,4.5));
        System.out.println(average("ahmad",1,4.3,22.4,33,45.3,55.4));

    }
}

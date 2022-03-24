package ch4;

public class Tabular {
    public static void main(String[] args) {
        int count=1;
        System.out.printf("N\tN*2\tN*3\tN*4%n");
        while (count <= 5){

            System.out.printf("%d \t %d\t %d\t %d %n",count,count*2,count*3,count*4);
            count++;
        }
    }
}

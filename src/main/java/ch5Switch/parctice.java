package ch5Switch;

public class parctice {
    public static void main(String[] args) {
        double pricipal = 1000;
        double rate = 0.5;
        int two = 2;

        System.out.printf("%s%30s%n", "Year", "Amount deposit in this year");
        for (int i = 1; i <= 10; i++) {
            double amount = pricipal * Math.pow(1 + rate, i);
            System.out.printf("%d%,20.2f%n", i, amount);
            System.out.println("");
            System.out.printf("Power of %d * 2 = %3.1f%n", i, Math.pow(two, i));

        }
        int sum = 0;
        System.out.println("\n\n");
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println("sum is" + sum);
        System.out.println("\n");
        int count = 1;
        while (count <= 36) {
            System.out.print(count + "\t");
            if (count % 6 == 0) {
                System.out.println("");
            }
            count++;
        }
      int x=9;
        while (x>0){
            System.out.println(x--);
        }
    }
}


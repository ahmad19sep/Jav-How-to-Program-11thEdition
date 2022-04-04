package ch5Switch;

public class Testing {

    public static void main(String[] args) {
        double pi = 0;
        double newPi=0;
        double piValue = 3.14159;

        int count = 0;
        int ch = 0;
        int i = 1;
        int termNo = 0;
        while (ch <= 200000) {
            if (count % 2 == 0) {
                pi += (double) 4 / i;

            } else {
                pi -= (double) 4 / i;
            }
            newPi=Double.parseDouble(String.format("%.4f",pi));
            i += 2;
            ch++;
            count++;
            System.out.printf("%.5f\t\t4/%d%n", newPi, i);
            if (newPi == piValue) {
                System.out.println("hello");
                int term = 0;
                if (term == 0) {
                    termNo = ch;
                    term++;
                }

            }
        }

        System.out.println(termNo + " Number of terms are required to make the value " +
                "equal to pi");
    }
}

package ch8ClassesAndObjects;

public class RationalNumbers {
    private int numerator;
    private int denominator;

    public RationalNumbers(int numerator, int denominator) {
        this.denominator = denominator;
        this.numerator = numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
}

package ch6methods;

import java.util.Scanner;

//Number converter
public class BinaryDecimalOctalHexDecimal {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {


            takeDecimal();
            binaryToDecimal();
            octalToDecimal();
            preDecimalToOctal();
            System.out.print("Press '0' to stop the program or any key to continue: ");
            if (scanner.nextInt() == 0) {
                break;
            }
        }
    }

    public static void preDecimalToOctal() {
        System.out.print("Enter decimal Number: ");
        int decimal = scanner.nextInt();
        String octal = "";
        for (int i = 1; i <= 30; i++) {
            if (decimal > 0) {
                int preOctal = decimal % 8;
                octal = octal + preOctal;
                decimal = decimal / 8;
            }

        }
        decimalToOctal(octal);
    }

    public static void decimalToOctal(String octal) {
        String octalNumber = "";
        int octal1 = Integer.parseInt(octal);

        for (int i = 1; i <= 30; i++) {
            if (octal1 > 0) {
                octalNumber = octalNumber + String.valueOf(octal1 % 10);

                octal1 = octal1 / 10;

            }
        }
        System.out.println("Octal Number: " + octalNumber);
    }

    public static void octalToDecimal() {
        System.out.print("Enter your octal Number: ");
        int octal = scanner.nextInt();
        int decimal = 0;
        for (int i = 1; i <= 4; i++) {
            if (octal > 1) {
                int preDecimal = octal % 10;
                decimal += preDecimal * (Math.pow(8, i - 1));
                octal = octal / 10;
            }
        }
        System.out.println("Decimal: " + decimal);
    }

    public static void binaryToDecimal() {
        int decimal = 0;
        System.out.print("Enter Binary Number: ");
        int binaryNum = scanner.nextInt();
        for (int i = 1; i <= 15; i++) {
            int preDecimal = 0;
            preDecimal = (binaryNum % 10);
            decimal += (int) (preDecimal * (Math.pow(2, i - 1)));
            binaryNum = binaryNum / 10;
        }
        System.out.println("Decimal Number" + decimal);

    }

    public static void takeDecimal() {

        System.out.print("Enter Decimal Number in four digits: ");
        int num;
        int loop2 = 0;
        num = scanner.nextInt();

        String binary = "";
        int newNumber;
        for (int i = 1; i <= 20; i++) {
            if (num > 0) {
                binary = binary + num % 2;
                loop2++;
                newNumber = num / 2;
                num = newNumber;


            } else {
                break;
            }


        }
        binaryNumber(binary, loop2);

    }

    public static void binaryNumber(String binary, int counter) {
        String originalBinary = "";

        int binaryConverter = 0;
        int InverseBinary = Integer.parseInt(binary);
        for (int i = 1; i <= counter; i++) {
            originalBinary = originalBinary + InverseBinary % 10;
            binaryConverter = InverseBinary / 10;
            InverseBinary = binaryConverter;
        }
        System.out.println("Binary Number " + originalBinary);

    }
}

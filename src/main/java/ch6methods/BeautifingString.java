package ch6methods;

import java.util.Scanner;

public class BeautifingString {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Enter a word: ");
        stringChecker(input.nextLine());
    }
    public static void stringChecker(String word){
        String s= word + ".";

        if(word.equals() s){
            System.out.println(word);
        }
    }
}

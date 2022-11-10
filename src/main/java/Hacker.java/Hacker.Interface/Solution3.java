import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


class Result {



    /*
     * Complete the 'typeCounter' function below.
     *
     * The function accepts STRING sentence as parameter.
     */

    public static void typeCounter(String sentence) {
        String[] a=sentence.split(" ");
        int d=0;
        int string=0;
        int inte=0;
        for (int i=0; i<a.length; i++){

            if (a[i].contains(".")){
                d++;
            }
            else if (a[i].contains("1")){
                inte++;
            }
            else if (a[i].contains("2")){
                inte++;
            }
            else if (a[i].contains("0")){
                inte++;
            }
            else if (a[i].contains("3")){
                inte++;
            }
            else if (a[i].contains("4")){
                inte++;
            }
            else if (a[i].contains("5")){
                inte++;
            }
            else if (a[i].contains("6")){
                inte++;
            }
            else if (a[i].contains("7")){
                inte++;
            }
            else if (a[i].contains("8")){
                inte++;
            }
            else if (a[i].contains("9")){
                inte++;
            }

            else {
                string++;

            }
        }
        System.out.println("string "+string);
        System.out.println("double "+d);
        System.out.println("integer "+inte);
    }

}




public class Solution3 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String sentence = bufferedReader.readLine();

        Result.typeCounter(sentence);

        bufferedReader.close();
    }
}

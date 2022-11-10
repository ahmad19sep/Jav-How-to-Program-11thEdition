package Hacker.java.Hacker.Interface;

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
     * Complete the 'decryptMessage' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING encryptedMessage as parameter.
     */

    public static String decryptMessage(String encryptedMessage) {
        String[] decrypt=encryptedMessage.split(" ");
        System.out.println(decrypt.length);
        String message="";
        for (int i=decrypt.length-1; i>=0; i--){
           message= message.concat(decrypt[i]+" ");
        }
        char[] ch={};
        message.getChars(0,1,ch,0);
        System.out.println(message);


return message;
    }

}

public class Solution2 {
    public static void main(String[] args) {
        Result.decryptMessage("Ahmad is name my");
    }
}
package Ch7Arrays.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BufferReader {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String  lines = br.readLine();

        String[] strs = lines.trim().split("\\s+");
        int[] a = new int[strs.length];
        for (int i = 0; i < strs.length; i++) {

            a[i] = Integer.parseInt(strs[i]);
        }
        System.out.println(a);
    }
}

package ch15Files;

import java.io.*;
import java.util.Scanner;

public class BufferReaderWithFileOp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        try {
            //Creating new file

            File dynamic_programming=new File("Dynamic_Programming");
            dynamic_programming.createNewFile();

            //Writing a file using Buffer reader
            BufferedWriter writer=new BufferedWriter(new FileWriter("Dynamic_Programming"));

                writer.write(input.nextLine());
                writer.close();

            // Reading a file using buffer reader

            BufferedReader reader=new BufferedReader(new FileReader("Dynamic_Programming"));
            System.out.println(reader.readLine());
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package ch15Files;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WritingDataInFile {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        try {
            FileWriter myFile = new FileWriter("/home/hp-notebook/Documents/MAC.txt");
            myFile.write(input.nextLine());
            myFile.close();
            myFile = new FileWriter("BasicFile.txt");
            myFile.write("This is Basic of files");
            myFile.close();
            System.out.println(myFile.getEncoding());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

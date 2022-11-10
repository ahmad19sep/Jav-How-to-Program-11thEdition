package ch15Files;

import java.io.*;
import java.nio.file.LinkPermission;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateTextFile {
    public static void main(String[] args) throws IOException {
        Scanner input=new Scanner(System.in);
        try {
           /* File clients=new File("Clients.txt");
            clients.createNewFile();*/
            Formatter writer=new Formatter(new FileWriter("Clients.txt"));
           // writer.format("AccountNumber\t\tName\t\tBalance%n");
            while (input.hasNext()){
                try {
                   writer.format("%-4d\t%s\t%s\t%.2f%n"
                           ,input.nextInt(),input.next(),input.next(),input.nextDouble());

                }catch (NoSuchElementException e){
                    System.out.println(" g");
                    input.nextLine();
                }
            }
            writer.close();


        }catch (SecurityException  |FileNotFoundException |
                FormatterClosedException e){
            e.printStackTrace();
        }
    }
}

package ch15Files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

// 5 different ways of reading a file
public class ReadTextFile {
    public static void main(String[] args) {

        //Open the file get the contents
        try {
            System.out.println("***** 1->Using Scanner Class ********");
            Scanner input = new Scanner(Paths.get("Clients.txt"));

            while (input.hasNext()) {
                System.out.printf("%-4d\t%s\t%s\t%.2f%n", input.nextInt(), input.next(), input.next(), input.nextDouble());

            }

            System.out.println(" ********2-> Using Buffered Reader class **********");
            BufferedReader reader = new BufferedReader(new FileReader("Clients.txt"));
            reader.lines().forEach(System.out::println);
            reader.close();

            System.out.println(" ********3-> Using File Reader Class *******");
            FileReader myFile = new FileReader("Clients.txt");
            int i;
            while ((i = myFile.read()) != -1) {
                System.out.print((char) i);
            }
            myFile.close();

            System.out.println(" ********4-> As a list  *******");
            List list = Collections.EMPTY_LIST;
            list = Files.readAllLines(Path.of("Clients.txt"), StandardCharsets.UTF_8);
            System.out.println(list);

            System.out.println(" ******* 5-> Using String Class ********");
            String data = new String((Files.readAllBytes(Paths.get("Clients.txt"))));
            System.out.println(data);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

package ch15Files;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
//In this program we create a file and check a file weather it is present or not
// REad files and delete files

public class VeryBasicFileOperation {
    public static void main(String[] args) throws IOException {
        try {


            File myFile = new File("BasicFile.txt");
            if (myFile.createNewFile()) {
                System.out.println(myFile.getName());
            } else {
                System.out.println("AlreadyExist");
            }

            System.out.println(myFile.getCanonicalPath());

            File myMAC = new File("/home/hp-notebook/Documents/MAC.txt");
            System.out.println(myMAC.isFile());

            // Read files portion

            Scanner input = new Scanner(myMAC);
            StringBuilder myMacFileData = new StringBuilder();
            while (input.hasNextLine()) {
                myMacFileData.append(input.nextLine());


            }
            input.close();
            String myFileData = "";
            input = new Scanner(myFile);
            while (input.hasNextLine()) {
                myFileData = input.nextLine();
            }
            input.close();
            System.out.printf("myMAC Data: \n%s\n", myMacFileData.toString());
            System.out.printf("myFile Data: \n%s\n", myFileData);

            // Delete files portion

            if (myFile.delete())
                System.out.println("File is deleted successfully");
            else
                System.out.println("Some error is occurred");

          // checking the myFIle exist or not
            System.out.println(myFile.isFile());
        } catch (IOException e) {
            e.fillInStackTrace();
        }


    }
}

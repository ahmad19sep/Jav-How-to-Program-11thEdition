package ch15Files;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileAndDirectoryInfo {
    public static void main(String[] args) throws IOException {

        //Only taking the path of the object does not do anything with file

        Path path = Paths.get("/home/hp-notebook/Java-How-to-Program-11thE/files/Student_File.txt");
        if (Files.exists(path)) {
            //Getting name of the file
            System.out.printf("%nFileName: %s%n", path.getFileName());
            //IS WRITE ABLE OR  NOT
            System.out.printf("%nIs Writable ? %s%n", Files.isWritable(path) ? "Yes" : "No");
            //Display file or Directory Information
            System.out.printf("%nIs Directory ? %s%n", Files.isDirectory(path) ? "Yes" : "No");
            //Absolute Path
            System.out.printf("%nAbsolute path ? %s%n", path.isAbsolute() ? "Yes it is" : "No it does not");
            //Last modified date
            System.out.printf("%nLast Modified Date: %s%n", Files.getLastModifiedTime(path));
            //Owner of File
            System.out.printf("%nOwner : %s%n", Files.getOwner(path));
            //Size
            System.out.printf("%nSize: %s%n",Files.size(path));
            //Absolute path  printing
            System.out.printf("%nAbsolute Path: %s%n",path.toAbsolutePath());



        }
    }
}

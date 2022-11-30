package ch15Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.util.Scanner;

import static ch15Files.FileDownloaderByParts.file;
import static ch15Files.FileDownloaderByParts.path;

public class mergingFileUsingNio {
    public static void main(String[] args) throws IOException {
mergingFilesUsingChannels();
    }
    private static void mergingFilesUsingChannels() throws IOException {
        File myFile = file();
        FileChannel sourceFile = null;
        FileChannel destination = null;
        System.out.print("How many files you want to merge: ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            Path path = path();

            try {
                sourceFile = new FileInputStream(String.valueOf(path)).getChannel();
                destination = new FileOutputStream(myFile,true).getChannel();

                destination.transferFrom(sourceFile, 0, sourceFile.size());
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                sourceFile.close();
                destination.close();
            }

        }
    }


    }


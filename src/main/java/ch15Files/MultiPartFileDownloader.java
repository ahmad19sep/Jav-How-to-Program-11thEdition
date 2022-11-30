package ch15Files;

import UdemyCourse.ThreadColor;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.channels.FileChannel;
import java.util.Date;
import java.util.Scanner;

public class MultiPartFileDownloader {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        System.out.print("Enter file URL: ");
        String url = input.nextLine();
        long fileLength = getFileLength(url);
        String fileName = url.substring(((url.lastIndexOf("/") + 1)));
        File filePart1 = downloadFilePart(url, 0L, fileLength / 2);
        File filePart2 = downloadFilePart(url, fileLength / 2, fileLength - (fileLength / 2));
        File file = mergeFiles(filePart1, filePart2, fileName);
        System.out.println("File downloaded successfully.");
    }

    private static long getFileLength(String url) {
        HttpURLConnection connection = null;
        try {

            connection = (HttpURLConnection) new URL(url).openConnection();

            connection.setRequestMethod("HEAD");
            connection.getInputStream();

        } catch (IOException e) {
            e.printStackTrace();
        }
        assert connection != null;
        return connection.getContentLength();
    }

    private static File downloadFilePart(String url, long offset, long size) {
        File file = new File(System.getProperty("java.io.tmpdir")+"/"+new Date().getTime() + "");
        try {
            BufferedInputStream stream = new BufferedInputStream(
                    new URL(url).openStream());
            stream.skip(offset);
            FileOutputStream outputStream = new FileOutputStream(file);
            long downloadedBytes = 0;
            byte[] data = new byte[10000];
            int bytesRead;
            int remainingBytes = 0;

            for (long i = 0; i <= size; i = downloadedBytes) {
                if (size - i <= 10000) {
                    bytesRead = stream.read(data, 0, remainingBytes);
                    if (size == downloadedBytes) break;
                } else {
                    bytesRead = stream.read(data, 0, 10000);
                }
                outputStream.write(data, 0, bytesRead);
                downloadedBytes += bytesRead;
                remainingBytes = (int) (size - downloadedBytes);
                displayDownloadProgress(file.getName(), downloadedBytes, size);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return file;
    }

    private static void displayDownloadProgress(String fileName, long downloadedBytes, long totalBytes) {
        long pr = ((downloadedBytes * 100) / totalBytes);
        float size = 0;

        String conversionName = "";
        if (totalBytes >= 1048576) {
            size = (float) (totalBytes / (Math.pow(1024, 2)));
            conversionName = "MB";
        } else {
            size = totalBytes / 1024.0f;
            conversionName = "KB";
        }
        System.out.printf(ThreadColor.ANSI_PURPLE + "%s\t%d%s of %.2f %s   \r", fileName, pr, "%", size, conversionName);
    }

    private static File mergeFiles(File file1, File file2, String destFileName) throws IOException {
        File ds = new File(destFileName);
        if(ds.exists())
            ds.delete();
        ds.createNewFile();
        FileChannel source1 = null;
        FileChannel source2 = null;
        FileChannel destination = null;

        try {
            source1 = new FileInputStream(file1).getChannel();
            source2 = new FileInputStream(file2).getChannel();
            destination = new FileOutputStream(ds, true).getChannel();

            destination.transferFrom(source1, 0, source1.size());
            destination.transferFrom(source2, 0, source2.size());

            source1.close();
            source2.close();
            destination.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ds;
    }
}

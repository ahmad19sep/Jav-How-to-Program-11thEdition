package ch15Files;


import UdemyCourse.ThreadColor;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class FileDownloaderByParts {
    public static void main(String[] args) throws IOException {

        url();


    }

    private static void url() {
        try {

            String url1 = "";

            // getting url from Internet
            System.out.print("Please Enter the URL : ");
            Scanner input = new Scanner(System.in);

            URL url = new URL(input.nextLine());
            // Getting file name
            url1 = url.getFile();
            String fileName = url1.substring(((url1.lastIndexOf("/") + 1)));
            File myFile = new File(fileName);
            if (!myFile.isFile()) {
                myFile.delete();
                myFile.createNewFile();
            }

            fetchingDataM1(url, new File((("1_" + myFile))));
            fetchingDataM2(url, new File((("2_" + myFile))));
        } catch (IOException ignored) {

        }
    }

    private static void fetchingDataM1(URL url, File myFile) {
        try {
// getting the totalNumber of bytes
            long length = getLength(url) / 2;


            System.out.println(ThreadColor.ANSI_CYAN + myFile);

            // creating the stream of file

            BufferedInputStream stream = new BufferedInputStream(url.openStream());
            stream.skip(length);


            FileOutputStream outputStream = new FileOutputStream(myFile);

            // Fetch data from the internet and put in to the desire file

            long downloadedBytes = 0;
            byte[] data = new byte[8000];
            int bytesRead;
            while ((bytesRead = stream.read(data, 0, 8000)) != -1) {
                outputStream.write(data, 0, bytesRead);
                downloadedBytes += bytesRead;

                //Display the downloading process

                downloadingDisplay(downloadedBytes, length);

            }

            System.out.println(ThreadColor.ANSI_GREEN + "\n Complete :)");

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private static void fetchingDataM2(URL url, File myFile) {

        try {
// getting the totalNumber of bytes
            long length = getLength(url) / 2;


            System.out.println(ThreadColor.ANSI_CYAN + myFile);

            // creating the stream of file

            BufferedInputStream stream = new BufferedInputStream(url.openStream());


            FileOutputStream outputStream = new FileOutputStream(myFile);

            // Fetch data from the internet and put in to the desire file

            long downloadedBytes = 0;
            byte[] data = new byte[8000];
            int bytesRead;
            System.out.println(length);
            for (long i = 0; i <= length; i = downloadedBytes) {
                bytesRead = stream.read(data, 0, 8000);
                outputStream.write(data, 0, bytesRead);
                downloadedBytes += bytesRead;

                //Display the downloading process

                downloadingDisplay(downloadedBytes, length);


            }

            System.out.println(ThreadColor.ANSI_GREEN + "\n Complete :)");

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    private static void downloadingDisplay(long downloadedBytes, long totalBytes) {
        long pr = ((downloadedBytes * 100) / totalBytes);
        float size = 0;

        String conversionName = "";
        if (totalBytes >= 1048576) {
            size = (float) (totalBytes / (Math.pow(1024, 2)));
            conversionName = "MB";
        } else {
            size = totalBytes / 1024;
            conversionName = "KB";
        }
        System.out.printf(ThreadColor.ANSI_PURPLE + "%d%s of %.2f %s   \r", pr, "%", size, conversionName);
        //System.out.print(ThreadColor.ANSI_PURPLE + " " + pr + "% "+" of %2.f"+size+conversionName+"\r");
        //0 B/s - 4.7 MB of 5.0 MB, Paused
    }

    private static void fetchingDataM3(URL url, File myFile) {
        try {

            InputStream in = url.openStream();

            Files.copy(in, Paths.get(String.valueOf(myFile)), StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException ignored) {

        }

    }

    private static long getLength(URL url) {
        HttpURLConnection connection = null;
        try {

            connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("HEAD");
            connection.getInputStream();

        } catch (IOException e) {
            e.printStackTrace();
        }
        assert connection != null;
        return connection.getContentLength();
    }

    private static void mergeFiles() {

        try {

            BufferedInputStream stream = new BufferedInputStream(
                    new FileInputStream(String.valueOf(path())));

            FileOutputStream outputStream=new FileOutputStream(file());

            long downloadedBytes = 0;
            byte[] data = new byte[8000];
            int bytesRead;
            while ((bytesRead = stream.read(data, 0, 8000)) != -1) {
                outputStream.write(data, 0, bytesRead);
                downloadedBytes += bytesRead;

                //Display the downloading process

              //  downloadingDisplay(downloadedBytes, length);

            }


        } catch (Exception e) {
            System.out.println(ThreadColor.ANSI_RED + "Error while merging the file");
        }
    }

    static File file() {
        File myFile = null;
        try {

            myFile = new File("3.txt");
            if (myFile.exists()) {
                myFile.delete();
                myFile.createNewFile();
            }else myFile.createNewFile();
        } catch (IOException e) {
            System.out.println(ThreadColor.ANSI_RED + "Error in File Name");
        }
        return myFile;
    }

    static Path path(){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the file Name for getting data: ");
        return Paths.get(scanner.nextLine());
    }
}

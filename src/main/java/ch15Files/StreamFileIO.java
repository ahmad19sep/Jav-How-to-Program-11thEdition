package ch15Files;

import Samples.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StreamFileIO {
    static List<StudentSample> students = new ArrayList<>();
    static Scanner input = new Scanner(System.in);
static File studentFile=new File("Student_File.txt");

    public static void main(String[] args) throws Exception {

        studentFile.createNewFile();
        BufferedReader reader=new BufferedReader(new FileReader(studentFile));
        System.out.println(reader.readLine());
       /* while (true) {
            menu();
        }*/

    }
    private static void menu(){

        System.out.print("Enter 1 for adding new Student : ");
        System.out.print("Enter 2 for adding for Display file : ");

        if (input.nextInt()==1) list();
        if (input.nextInt()==2) display(students);
    }
    private static void display(List<StudentSample> students) {
        try {

            ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(studentFile));
            if (studentFile.isFile()){
                outputStream.writeObject(studentFile);
                outputStream.write(3);
                outputStream.close();
            }
            ObjectInputStream inputStream=new ObjectInputStream(new FileInputStream(studentFile));
            if (studentFile.isFile()){
                students=(List<StudentSample>)(inputStream.readObject());
                inputStream.close();
                System.out.println(students);
            }



        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    private static void list() {
        System.out.print("How Much Student you want to Add: ");
        int num = input.nextInt();
        int age = 0;
        String name, id, clas;
        for (int i = 0; i < num; i++) {
            System.out.printf("***** Student Number %d ******%n", i + 1);
            System.out.print("Enter age: ");
            age = input.nextInt();
            System.out.print("Enter name: ");
            name = input.next();

            System.out.print("Enter id: ");
            id = input.next();

            System.out.print("Enter class: ");
            clas = input.next();
            System.out.println();
            students.add(new StudentSample(name, id, age, clas));

        }
    }
}

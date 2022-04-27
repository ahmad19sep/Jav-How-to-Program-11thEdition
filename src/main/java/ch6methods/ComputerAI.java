package ch6methods;

import ch4.While;

import java.security.SecureRandom;
import java.util.Scanner;

// ch 6
// question 6.35 6.36
public class ComputerAI {
    static Scanner scanner=new Scanner(System.in);
    static SecureRandom input=new SecureRandom();
    static  int correctAnswerCounter=0;

    public static void main(String[] args) {
       mainFunction();
     correctAnswerCounter(correctAnswerCounter);
       }


    public static int  getAnswer(int num1,int num2){
        System.out.print("How much is "
                +num2+" times "+num1+" ");
        return scanner.nextInt();

    }
    public static void correctAnswer(){
        int num=1+input.nextInt(4);
        switch (num){
            case 1:
                System.out.println("Very good");
                break;
            case 2:
                System.out.println("Excellent");
                break;
            case 3:
                System.out.println("Nice Work");
                break;
            case 4:
                System.out.println("Keep up the good work");
                break;
        }

    }
    public static void wrongAnswer(){
        int num=1+input.nextInt(4);
        switch (num){
            case 1:
                System.out.println("No. please try again");
                break;
            case 2:
                System.out.println("Wrong. Try again");
                break;
            case 3:
                System.out.println("Don't give up!");
                break;
            case 4:
                System.out.println("NO.keep trying again");
                break;
        }
    }
    public static void spaceF(){
        for (int i = 1; i <= 10; i++)
        {

            System.out.println("");
        }

    }
    public static void correctAnswerCounter(int num){
        if (num>=2){
            System.out.println("Congratulations,you are ready to go next level");
            System.out.println("Want to go a difficult level of multiplication press 2: ");
            System.out.print("Do another arithmetic  operation press 3: ");
            int selection=scanner.nextInt();
            if(selection==2){
                correctAnswerCounter=0;

                level2();
            }
            else if (selection==3){
                correctAnswerCounter=0;
                arithmeticOperation();
            }
        }

        else {
            System.out.println("Please ask your teacher for help");
        }

    }
    public static void mainFunction(){
        int count=0;


        while (true)
        {

            int num1=input.nextInt(9);
            int num2=input.nextInt(9);
            count++;
            while (true)
            {
                if (getAnswer(num1,num2)==num1*num2)
                {
                    correctAnswer();
                    correctAnswerCounter++;
                    spaceF();
                    break;
                }
                else
                {

                    wrongAnswer();
                }

            }
            if(count==3){
                correctAnswerCounter(correctAnswerCounter);
                break;
            }
        }
    }
    public static void level2(){
        int count=0;


        while (true)
        {

            int num1=input.nextInt(99);
            int num2=input.nextInt(99);
            count++;
            while (true)
            {
                if (getAnswer(num1,num2)==num1*num2)
                {
                    correctAnswer();
                    correctAnswerCounter++;
                    spaceF();
                    break;
                }
                else
                {

                    wrongAnswer();
                }

            }
            if(count==3){
                break;
            }
        }
        correctAnswerCounter(correctAnswerCounter);
    }
    public static void arithmeticOperation(){
        System.out.println("For Addition  press:1\t" +
                " For Subtraction press:2 \t For Division press:3");
        int selection=scanner.nextInt();
        if(selection==1){
            addition();
        }
        if(selection==2){
            subtraction();
        }
        if(selection==3){
            division();
        }
    }
    public static void addition(){
        int count=0;


        while (true)
        {

            int num1=input.nextInt(66);
            int num2=input.nextInt(44);
            count++;
            while (true)
            {
                if (getAnswer(num1,num2)==num1+num2)
                {
                    correctAnswer();
                    correctAnswerCounter++;
                    spaceF();
                    break;
                }
                else
                {

                    wrongAnswer();
                }

            }
            if(count==3){
                correctAnswerCounter(correctAnswerCounter);
                break;
            }
        }
    }
    public static void subtraction(){
        int count=0;


        while (true)
        {

            int num1=input.nextInt(66);
            int num2=input.nextInt(100);
            count++;
            while (true)
            {
                if (getAnswer(num1,num2)==num2-num1)
                {
                    correctAnswer();
                    correctAnswerCounter++;
                    spaceF();
                    break;
                }
                else
                {

                    wrongAnswer();
                }

            }
            if(count==3){
                correctAnswerCounter(correctAnswerCounter);
                break;
            }
        }
    }
    public static void division(){
        int count=0;


        while (true)
        {

            int num1=input.nextInt(100);
            int num2=0;
            for (int i=2; i<=10; i++){
                if (num1%i==0){
                    num2=i;
                    break;
                }
            }
            count++;
            while (true)
            {
                if (getAnswer(num1,num2)==num1/num2)
                {
                    correctAnswer();
                    correctAnswerCounter++;
                    spaceF();
                    break;
                }
                else
                {

                    wrongAnswer();
                }

            }
            if(count==3){
                correctAnswerCounter(correctAnswerCounter);
                break;
            }
        }
    }
    }


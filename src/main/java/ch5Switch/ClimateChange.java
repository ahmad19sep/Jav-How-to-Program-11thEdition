package ch5Switch;

import java.util.Scanner;

public class ClimateChange {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("********CLIMATE CHANGE*********");
        System.out.println("------Quiz---------");
        char answer1,answer2,answer3,answer4,answer5;
        int totalMarks=0;

            System.out.println("Select the right option");
            System.out.println("Question No 1");
            System.out.println("Average Rising Temperature Per Year");
            System.out.println("(a) 1%  (b) 2%   (c)  4%   (d) 1.5%");
            answer1=input.next().charAt(0);
        System.out.println("Question No 2");
        System.out.println("Major Cause of Climate change is ");
        System.out.println("(a) HumanActivity  (b) Animals  (c)  Trees   (d) Sea");
        answer2=input.next().charAt(0);
        System.out.println("Question No 3");
        System.out.println("Gas that effect enviroment is ");
        System.out.println("(a) Nitrogen (b) Oxygen   (c)  Hydrogen   (d) CarbonDioxide");
        answer3=input.next().charAt(0);
        System.out.println("Question No 4");
        System.out.println("Which one is best for controling climate");
        System.out.println("(a) Water (b) food  (c)  Tree  (d) Technology");
        answer4=input.next().charAt(0);
        System.out.println("Question No 5");
        System.out.println("Who is responsible for climate change");
        System.out.println("(a) Animals  (b) Birds   (c)  Human   (d) All");
        answer5=input.next().charAt(0);
        if(answer1=='d'){
            totalMarks++;
        }
        if(answer2=='a'){
            totalMarks++;
        }
        if(answer3=='d'){
            totalMarks++;
        }
        if(answer4=='c'){
            totalMarks++;
        }
        if(answer5=='c'){
            totalMarks++;
        }
        if(totalMarks==5){
            System.out.println("Excellent result with marks "+totalMarks);
        }
        if(totalMarks==4){
            System.out.println("Good result with marks "+totalMarks);
        }
        if(totalMarks<=3){
            System.out.println("Time to brush up your knowledge your marks "+totalMarks);
            System.out.println("Improve your knowledge and try again");
        }


    }

    }


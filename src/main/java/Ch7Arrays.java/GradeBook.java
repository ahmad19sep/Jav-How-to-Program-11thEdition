package Ch7Arrays.java;

public class GradeBook {
    private String courseName;
    private int[] grades;
    public GradeBook(String courseName,int[] grades){
        this.courseName=courseName;
        this.grades=grades;
    }
    public void setCourseName(String courseName){
        this.courseName=courseName;
    }
    public String getCourseName(){
        return courseName;
    }
    public void processGrades(){

        studentGrades();
        averageClass();
        minimumGrades();
        maximumGrades();
        gradeDistribution();
    }
    public void studentGrades(){
        for (int student=0; student< grades.length; student++){
            System.out.printf("Student %d:\t%d%n",student,grades[student]);
        }
    }
    public void averageClass(){
        int total=0;
        for (int average : grades ){
            total+=average;
        }
        double average=(double) total/ grades.length;
        System.out.printf("Class Average is %.2f%n",average);
    }
    public void minimumGrades(){
        int minimum=grades[0];
        for (int checker : grades){
            if (checker < minimum){
                minimum=checker;
            }
        }
        System.out.printf("Lowest grade is %d%n",minimum);
    }
    public void maximumGrades(){
        int maximum=grades[0];
        for (int checker : grades){
            if (checker > maximum){
                maximum=checker;
            }
        }
        System.out.printf("Highest  grade is %d%n",maximum);
    }
    public void gradeDistribution(){
        int[] frequency=new int[11];
       for (int count : grades){
           ++frequency[count/10];
        }
        for (int i=0; i<frequency.length; i++){
            if (i==10){
                System.out.print("100:");
            }
            else {
                System.out.printf("%02d-%02d:", i * 10, i * 10 + 9);
            }
        for(int star=0; star<frequency[i]; star++){

            System.out.print("*");
        }System.out.println();

    }
}}

package Ch7Arrays.java;

public class GradeBookMain {
    public static void main(String[] args) {
        int[] grades={100,34,56,3,56,78,49,87,56,89,45};
        GradeBook I2gradeBook=new GradeBook("\t\tGRADE BOOK 1\n\t\t" +
                "Computer",grades);
        System.out.println(  I2gradeBook.getCourseName()+"\n\nTHE GRADES ARE\n");
        I2gradeBook.processGrades();
        int[] urdu={23,45,8,45,23,12,78,95,56,78,34,78,34,100,23,56,78,56};
        GradeBook gradeBook2=new GradeBook("\t\tGRADE BOOK 2\n" +
                "\t\t\tURDU\n",urdu);
        System.out.println(gradeBook2.getCourseName()+"THE GRADES ARE\n");
        gradeBook2.processGrades();
    }
}

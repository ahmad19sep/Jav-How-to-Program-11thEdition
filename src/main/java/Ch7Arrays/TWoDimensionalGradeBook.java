package Ch7Arrays.java;

public class TWoDimensionalGradeBook {
    private String courseBook;
    private int[][] grades;

    public TWoDimensionalGradeBook(String courseBook, int[][] grades) {
        this.courseBook = courseBook;
        this.grades = grades;
    }

    public void setCourseBook(String courseBook) {
        this.courseBook = courseBook;
    }

    public String getCourseBook() {
        return this.courseBook;
    }

    public void gradeProcess() {
        studentGradesOTP();
        getMaximum();
        getMinimum();
        giveStars();
    }

    public void studentGradesOTP() {
        double average = 0;
        int rollNoCounter = 0;
        studentList();
        for (int i = 0; i < grades.length; i++) {
            System.out.println("\t\t\t\t------------------------------------------------------------------" +
                    "----------------");
            System.out.printf("%5s%2d---", "Student:", i + 1);
            for (int marks : grades[i]) {
                System.out.printf("%10d", marks);
                if (rollNoCounter != 0) {
                    average += marks;
                }
            }
            rollNoCounter++;
            averageCalculator(average, grades[0].length);
        }


    }

    public void studentList() {
        System.out.printf("%26s", "ROLL NO");
        System.out.printf("%10s%10s%10s%9s%10s%10s%10s%n", "COMPUTER", "MATH", "PHYSICS",
                "IST", "URDU", "ENGLISH", "AVERAGE");
    }

    public void averageCalculator(double average, int length) {
        System.out.printf("%10.2f%n%n%n", average / (length - 1));
    }
    public void getMaximum(){
        int maximum=grades[0][0];
        for (int[] grade : grades) {
            for (int count : grade) {
                if (count > maximum) {

                    maximum = count;
                }
            }
        }
        System.out.printf("Highest grade in the class is %d%n",maximum);

    }
    public void getMinimum(){
        int minimum=grades[0][0];
        for (int[] grade : grades) {
            for (int count : grade) {
                if (count < minimum) {

                    minimum = count;
                }
            }
        }
        System.out.printf("Lowest grade in the class is %d%n",minimum);

    }
    public void giveStars(){
        System.out.printf("Over all grade distribution%n");
        int[] frequency=new int[11];
        for (int[] grade : grades) {
            for (int count : grade) {
                ++frequency[count / 10];
            }
        }for (int count=0; count<frequency.length; count++){
            if (count==10){
                System.out.print("100:");
            }
            else {


                System.out.printf("%02d-%02d:", count * 10, count * 10 + 9);
            }
            for (int star=0; star < frequency[count]; count++){
                System.out.print("*");
            }
            System.out.printf("%n");
        }
    }

}




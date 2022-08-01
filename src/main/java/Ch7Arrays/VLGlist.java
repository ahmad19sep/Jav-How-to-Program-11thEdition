package Ch7Arrays.java;

public class VLGlist {
    public static void main(String[] args) {
        System.out.print("Enter the numbers: ");
        double average=0;
    }
    public static double average(double...avg){
        double total=0;
        for (double i : avg){
            total+=i;
        }
        return total/avg.length;
    }
}

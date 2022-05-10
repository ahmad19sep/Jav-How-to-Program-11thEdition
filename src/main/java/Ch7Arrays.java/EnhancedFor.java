package Ch7Arrays.java;

public class EnhancedFor {
    public static void main(String[] args) {
        int[] cows={1,2,4,5,2,6,7,8};
        int total=0;
        //original Array
        for (int sum: cows){
            System.out.print(sum+" ");
        }
        System.out.println();

        modifyArray(cows);

        for (int sum: cows){

            System.out.print(sum+" ");
        }
        System.out.println(" \n");

        modifyElement(cows);
        System.out.println(cows[2]);
        for (int sum: cows){

            System.out.print(sum+" ");
        }
    }
    public static void modifyArray(int [] cow){
        for (int count=0; count<cow.length; count++){
            cow[count]*=2;
        }
    }
    public static void modifyElement(int[] singleArray){
        singleArray[2]*=2;
        System.out.println(singleArray[2]);
    }
}

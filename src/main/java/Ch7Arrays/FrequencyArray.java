package Ch7Arrays.java;

public class FrequencyArray {
    public static void main(String[] args) {
        int[] responces = {1,2,9,4,3,5,2,1,8,3,1,4,3,3,3,2,3,3,2,14};
        int[] frequency = new int[6];
        for (int i = 0; i < responces.length; i++) {
            try {
                ++frequency[responces[i]];
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println(e);
                System.out.printf("response[%d] =%d%n%n", i, responces[i]);
            }
        }
        System.out.println("\tRating\tFrequency");
        for (int rating = 1; rating < frequency.length; rating++) {
            System.out.printf("%6d%10d%n", rating, frequency[rating]);
        }
    }
}


package parctice;

public class ValidationTester {
    public static void main(String[] args) {
        try {
        Validation s1=new Validation(213,"sdd");
        System.out.println(s1);
    }
        catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());



        }}}

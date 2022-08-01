package parctice;

public class MainTest {
    public static void main(String[] args) {
        MainFunction std1=new MainFunction(54);
        try {

            System.out.println(std1.getNum());
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }


        try {
            std1.setNum(238);

        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        System.out.println(std1.getNum());
    }
}

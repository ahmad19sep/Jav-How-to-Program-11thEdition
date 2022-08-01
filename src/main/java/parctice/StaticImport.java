package parctice;
public class StaticImport {
public static void main(String[] args){
    Sum sum1= new Sum();
    sum1.name="ddd";
    sum1.num=22;
    System.out.println(sum1.name);
    }

    static class Sum {



        int num = 0;
        String name;

      //  @Override
     /*   public String toString() {
            return String.format("%d + %s", num, name);
        }*/
    }
}
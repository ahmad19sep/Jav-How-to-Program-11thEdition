package parctice;

public class Continue {
    public static void main(String [] ags){
        int num=4;
        int num1=445;
        int num2=num-num1;
        while (num > 0){
            if(num==3){
                num--;
                continue;
            }
            System.out.println(num);
          num--;
        }
        if ((num < 7) || num1 <34 ){
            System.out.println("Condition false");
        }
        if ((num >-1 && num2 <34)) {
            System.out.println("Condition true");
        }
            if (num==1){
                System.out.println("Fasle");
            }



}


}

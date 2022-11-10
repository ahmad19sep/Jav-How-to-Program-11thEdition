package parctice;

import java.util.Scanner;

public class HasNext {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
      String s="hello";
      while (input.hasNext()){
          if (input.equals(s)) {
              break;
          }
      }
    }
}

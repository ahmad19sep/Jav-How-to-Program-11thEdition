package Hacker.java.Hacker.Interface;

import ch4.SalesCommission;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class Liste {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int num = scanner.nextInt();
        String checker;
        for (int i = 0; i < num; i++) {
            list.add((scanner.nextInt()));
        }
     int a= scanner.nextInt();
        for (int i=0; i<a; i++) {

            checker = scanner.next();
            if (Objects.equals(checker, "Insert")) {
                list.add(scanner.nextInt(), scanner.nextInt());
            } else if (checker.equals("Delete")) {
                list.remove(scanner.nextInt());
            }

        }
       for (int i : list)
           System.out.print(i+" ");
    }
}

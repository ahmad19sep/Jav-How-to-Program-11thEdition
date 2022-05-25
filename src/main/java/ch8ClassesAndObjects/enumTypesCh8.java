package ch8ClassesAndObjects;

import java.util.EnumSet;

public class enumTypesCh8 {
    public static void main(String[] args) {
        for (enumBook i : enumBook.values()) {
            System.out.printf("%-10s-%-45s%s%n", i, i.getBookTitle(), i.getCopyRightyear());
        }
        System.out.println("-----Range--------------");
        for (enumBook j : EnumSet.range(enumBook.CHTP, enumBook.HAS)) {
            System.out.printf("%-10s-%-45s%s%n", j, j.getBookTitle(), j.getCopyRightyear());
        }
    }
}

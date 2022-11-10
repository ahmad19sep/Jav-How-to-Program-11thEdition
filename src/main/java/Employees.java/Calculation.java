package Employees.java;

import ch8ClassesAndObjects.Date;

public class Calculation {
    public static void main(String [] args) {
        int month = new java.util.Date().getMonth();

        Employee a, b, c, d;
        a = new HourlyEmployee("ali", "raza", "35301-787-8",
                0345245, 78, 67, new Date(2017, 7, 4));


        b = new SalariedEmployee("ali", "raza", "35301-787-8", 98756,
                567, new Date(2008, 9, 6));

        c = new BasePlusCM(5900, "Raza", "ALi", "35301-34443-343", 908,
                900, new Date(398, 5, 2));

        d = new CommissionEmployee("Ahmad", "Raza", "35301-3444", 342334,
                434, new Date(3424, 7, 7));

      /*  Employee[] array = {a, b, c, d};
        for (Employee i : array) {*/
            if (month == d.getBirthDate().getMonth()) {
                System.out.println((Integer.parseInt(d.earnings () ))+100);
            }}}






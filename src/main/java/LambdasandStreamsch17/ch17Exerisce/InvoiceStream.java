package LambdasandStreamsch17.ch17Exerisce;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class InvoiceStream {
    public static void main(String[] args) {
        Invoice[] invoices = {
                new Invoice("83", "Electric sander", 7, 57.98f),
                new Invoice("24", "Power saw", 18, 99.99f),
                new Invoice("7", "Sledge hammer", 11, 21.50f),
                new Invoice("77", "Hammer", 76, 11.90f),
                new Invoice("39", "Lawn mower", 3, 79.50f),
                new Invoice("68", "Screwdriver", 106, 6.99f),
                new Invoice("56", "Jig saw", 21, 11.00f),
                new Invoice("3", "Wrench", 34, 7.50f)
        };
      /*  System.out.println("\n******* Sorting on the behalf of Part Description **********\n");
        Arrays.stream(invoices)
                .sorted(Comparator.comparing(Invoice::getPartDescription))
                .forEach(System.out::println);

        System.out.println("\n****** Sorting on the Behalf on price***********\n");
        Arrays.stream(invoices)
                .sorted(Comparator.comparing(Invoice::getPrice))
                .forEach(System.out::println);
*/
       Arrays.stream(invoices)
               .map(Invoice::getPartDescription)
               .map(String::codePoints)
               .collect(Collectors.toList()).forEach(System.out::println);
    }
}

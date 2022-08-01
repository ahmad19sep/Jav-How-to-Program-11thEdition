package parctice;
import java.util.EnumSet;
public class EnumTest {
    public static void main(String[] args) {
        for (Book books: Book.values()){
            System.out.printf("%-2s\t%s%20s%n",books,books.getTitle(),books.getBirthdate());
        }
        for (Book books : EnumSet.range(Book.ASD,Book.HBL)){
            System.out.printf("%-2s%5s%20s%n",books,books.getTitle(),books.getBirthdate());
        }
    }
}

package OOPInheritance.java;

public class PrintedBooks extends Books {
    private final String publisher;
    private final int ISBN;

    public PrintedBooks(String publisher, int ISBN, String title, int publishingYear, String author) {
        super(title, publishingYear, author);
        this.ISBN = ISBN;
        this.publisher = publisher;
    }

    public int getISBN() {
        return ISBN;
    }

    public String getPublisher() {
        return publisher;
    }

public String toString(){
        return super.toString()
                + String.format("Publisher : %s%n ISBN : %d",getPublisher(),getISBN());
}
}

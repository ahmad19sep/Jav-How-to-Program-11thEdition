package OOPInheritance.java;

public class SoftBook extends Books {
    private final int bookSize;
    private final int length;
    private final String arrtistName;
    public SoftBook(int bookSize, int length, String arrtistName,
                    String title, int publishingYear, String author){
        super(title,publishingYear,author);
        this.bookSize=bookSize;
        this.arrtistName=arrtistName;
        this.length=length;

    }

    public int getBookSize() {
        return bookSize;
    }
    public int getLength(){
        return this.length;
    }
    public String getArrtistName(){
        return this.arrtistName;
    }

    @Override
    public String toString() {
        return "SoftBook{" +
                "bookSize=" + bookSize +
                ", length=" + length +
                ", arrtistName='" + arrtistName + '\'' +
                "} " + super.toString();
    }
}

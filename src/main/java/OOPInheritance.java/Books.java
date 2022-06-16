package OOPInheritance.java;

public class Books {
    private final String title;
    private final int publishingYear;
    private final String author;
    public Books(String title, int publishingYear, String author){
        this.publishingYear=publishingYear;
        this.title=title;
        this.author=author;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
public String toString(){
        return String.format("Title: %s%nAuthor: %s\b %s",title,author,publishingYear);
}
}

package ch8ClassesAndObjects;

public   enum enumBook {
    JHTP("java how to program","2019"),
    CHTP("C How to program","2012"),
    HAS("Hafiz Ahamd Siddique","2001"),
    SS("Shahzad Siddique","2020");
    private final String bookTitle;
    private final String copyRightyear;
    enumBook(String bookTitle,String copyRightyear){
        this.bookTitle=bookTitle;
        this.copyRightyear=copyRightyear;
    }
    public String getBookTitle(){
        return this.bookTitle;
    }
    public String getCopyRightyear(){
        return this.copyRightyear;
    }


}

package parctice;

public enum Book {
    DPS("DISTRICT PUBLIC SCHOOL DEALPUR","2002"),
    ASD("ALLIED SCHOOL DEPALPUR","2012"),
    PGC("PUNJAB GROUP OF COLLEGES","1980"),
    HBL("HABIB LIMITED BANK","1950"),
    UBL("UNITED LIMITED BANK","1960"),
    PAK("PAKISTAN", "1947");
  private final String title;
  private final String birthdate;
   Book(String title, String birthdate){
      this.birthdate=birthdate;
      this.title=title;
    }

    public String getTitle() {
        return title;
    }

    public String getBirthdate() {
        return birthdate;
    }
}

package ch10OOP;

public abstract class generalTech implements  Tv {
    private String model;
    private String company;
    public generalTech(String name, String  company){
        this.company=company;
        this.model=name;
    }

    public String getName() {
        return model;
    }

    public void setName(String name) {
        this.model = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
    public abstract String size();

    public String screen(){
        return size;
    }
}

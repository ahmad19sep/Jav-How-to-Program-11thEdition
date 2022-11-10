package CompanyEmployeeDataBase;

public class EmployeeData {
    private String Firstname;
    private String lastName;
    private String qualification;
    private int age;
    private double salary;
    private float experience;
    private String department;
    private String companyPosition;

    public EmployeeData(String firstname, String lastName, String qualification, int age, double salary, float experience, String department, String companyPosition) {
        Firstname = firstname;
        this.lastName = lastName;
        this.qualification = qualification;
        this.age = age;
        this.salary = salary;
        this.experience = experience;
        this.department = department;
        this.companyPosition = companyPosition;
    }

    public EmployeeData() {

    }

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public float getExperience() {
        return experience;
    }

    public void setExperience(float experience) {
        this.experience = experience;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCompanyPosition() {
        return companyPosition;
    }

    public void setCompanyPosition(String companyPosition) {
        this.companyPosition = companyPosition;
    }
    public String toString(){
        return String.format("%-8s . %-8s . %8s . %4d . %8.1f . %8s . %-8s%n",Firstname,
                lastName,department,age,salary,companyPosition,qualification);
    }
}

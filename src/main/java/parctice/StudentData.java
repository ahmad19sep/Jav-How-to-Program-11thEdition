package parctice;

public class StudentData {
    private String schoolName;
    private String className;
    private Composition stdData;
    public StudentData(String schoolName,String className,Composition stdData){
        this.className=className;
        this.schoolName=schoolName;
        this.stdData=stdData;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
    public String toString(){
        return String.format("%s : %s %n %s : %s %n %s","SchoolName",schoolName,
                "Class",className,stdData);
    }
}

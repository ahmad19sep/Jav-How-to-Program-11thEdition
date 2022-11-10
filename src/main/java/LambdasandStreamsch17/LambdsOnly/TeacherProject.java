package LambdasandStreamsch17.LambdsOnly;

import java.beans.PropertyVetoException;

public class TeacherProject {
    private String name;
    private String lastName;
    private int age;
    private int idNum;
    private String subject;
    private String school;
    private String schoolBranch;
    private double salary;
   private int experience;
   private String eduction;
   private String teacherAddress;
   private String certifications;
   private String achievements;
   private String regularty;
   private double result;
   private String reviews;
   private String gender;


    public int getIdNum() {
        return idNum;
    }

    public void setIdNum(int idNum) {
        this.idNum = idNum;
    }

    public TeacherProject(String name, String lastName, int age, int idNum, String subject,
                          String school, String schoolBranch, double salary, int experience,
                          String eduction, String teacherAddress, String certifications,
                          String achievements, String regularty, double result, String reviews,String gender) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.idNum=idNum;
        this.subject = subject;
        this.school = school;
        this.schoolBranch = schoolBranch;
        this.salary = salary;
        this.experience = experience;
        this.eduction = eduction;
        this.teacherAddress = teacherAddress;
        this.certifications = certifications;
        this.achievements = achievements;
        this.regularty = regularty;
        this.result = result;
        this.reviews = reviews;
        this.gender=gender;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getSchoolCity() {
        return schoolBranch;
    }

    public void setSchoolCity(String schoolBranch) {
        this.schoolBranch = schoolBranch;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%-8s %-8s %4d %-5s %6s ",name,lastName,age,subject,school);
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getEduction() {
        return eduction;
    }

    public void setEduction(String eduction) {
        this.eduction = eduction;
    }

    public String getTeacherAddress() {
        return teacherAddress;
    }

    public void setTeacherAddress(String teacherAddress) {
        this.teacherAddress = teacherAddress;
    }

    public String getCertifications() {
        return certifications;
    }

    public void setCertifications(String certifications) {
        this.certifications = certifications;
    }

    public String getAchievements() {
        return achievements;
    }

    public void setAchievements(String achievements) {
        this.achievements = achievements;
    }

    public String getRegularty() {
        return regularty;
    }

    public void setRegularty(String regularty) {
        this.regularty = regularty;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public String getReviews() {
        return reviews;
    }

    public void setReviews(String reviews) {
        this.reviews = reviews;
    }

}

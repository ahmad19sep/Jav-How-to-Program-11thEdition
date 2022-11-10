package Samples;

import java.io.Serializable;

public class StudentSample implements Serializable {
   private String name;
   private String id;
   private int age;
   private String Clas;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public String getClas() {
        return Clas;
    }

    public void setClas(String aClas) {
        Clas = aClas;
    }

    public StudentSample(String name, String id, int age, String aClas) {
        this.name = name;
        this.id = id;
        this.age = age;
        Clas = aClas;

    }
    public String toString(){
        return String.format("%-8s%s\t%d\t%s",
                name,id,age,Clas);
    }
}

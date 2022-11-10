package LambdasandStreamsch17.LambdsOnly;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestingClassTeacher {
    static List<TeacherProject> list = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        list.add(new TeacherProject("Ali", "Ahmad", 31, 313, "Ist", "AlliedSchools", "Depalpur Campus",
                45.500, 5, "M.s.c Math", "Basirpur", "No certifications",
                "No achievements", "100%", 85, "According to the last year reviews it is a normal teacher", "male"));

        list.add(new TeacherProject("Ali", "Ahmad", 31, 313, "Math", "AlliedSchools", "Depalpur Campus",
                45.500, 5, "M.s.c Math", "Basirpur", "No certifications",
                "No achievements", "100%", 85, "According to the last year reviews it is a normal teacher", "male"));

        list.add(new TeacherProject("Asad", "Rehman", 23, 253, "Physics", "DPS", "Depalpur Campus",
                30000, 2, "M.s.c Physics", "Basirpur village Arora", "Basic Physics",
                "No achievements", "90%", 95, "According to the last year reviews it is a good  teacher", "male"));

        list.add(new TeacherProject("Asif", "javed", 40, 3013, "PHYSICS", "AlliedSchools", "Depalpur Campus",
                50000, 9, "Master in Physics", "Depalpur", "No certifications",
                "Vice principle of Allied school ", "95%", 95, "According to the last year reviews it is a great teacher and funny teacher", "male"));

        list.add(new TeacherProject("Gulam", "Rasool", 30, 900, "Urdu", "AL- Qalam school", "Basirur",
                20000, 6, "B.A in Urdu", "Hujra", "Has many urdu based  certifications",
                "No achievements", "70%", 75, "According to the last year reviews it is a :) teacher and some sort of  serious teacher", "male"));

        list.add(new TeacherProject("Asifa", "Azeem", 50, 540, "English", "Allied schools", "Depalpur branches",
                100000, 20, "B.A in English", "Depalpur", "No certifications",
                "Principle of Allied Schools", "70%", 65, "According to the last year reviews it is not a good principle", "female"));
//Getting the subjects from list as string and create a list of subjects

        Map<String,List<TeacherProject>> stringListMap=list.stream()
        .collect(Collectors.groupingBy(TeacherProject::getSubject));




        Function<TeacherProject, String> byFirstName = TeacherProject::getName;
        Function<TeacherProject, String> byLastName = TeacherProject::getLastName;
        Comparator<TeacherProject> name = Comparator.comparing(byLastName)
                .thenComparing(byFirstName)
                .thenComparing(TeacherProject::getAge)
                .thenComparing(TeacherProject::getSubject);
        list.stream().sorted(name).forEach(System.out::println);
        userInformation();


    }

    private static void userInformation() {
        System.out.print("Checking all the teachers in the Book press 'c' : ");
        System.out.print("\nChecking all the  Male teachers in the Book press 'm' : ");
        System.out.print("\nChecking all the Female teachers in the Book press 'f' : ");
        System.out.print("\nChecking all the male English teachers  in the Book press 'e' : ");
        System.out.print("\nChecking the most experienced teacher 'r' : ");
        char ch = scanner.next().charAt(0);
        if (ch == 'c') {
            printingMembers();
        } else if (ch == 'm') {
            maleTeachers();
        } else if (ch == 'f') {
            femaleTeachers();
        } else if (ch == 'e') {
            englishTeacher();
        } else if (ch == 'r') {
            mostExperiencedTeacher();
        }
    }

    private static void printingMembers() {
        list.forEach(System.out::println);
    }

    private static void maleTeachers() {
        list.stream()
                .filter(x -> x.getGender()
                        .equals("male"))
                .forEach(System.out::println);
    }

    private static void femaleTeachers() {
        list.stream()
                .filter(x -> x.getGender()
                        .equals("female"))
                .forEach(System.out::println);
    }

    private static void englishTeacher() {
        list.stream()
                .filter(x -> x.getSubject()
                        .equalsIgnoreCase("english"))
                .filter(x -> x.getGender().equalsIgnoreCase("male"))
                .forEach(System.out::println);
    }

    private static void mostExperiencedTeacher() {
        list.stream()
                .filter(t -> t.getAge() == 32)
                .findAny()
                .ifPresent(System.out::println);

    }
}

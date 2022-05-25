package ch8ClassesAndObjects;

public class PackageAccess {
    public static void main(String[] args) {
        PackageData.num = 77;
        PackageData.name="er";
    }
}
    class PackageData{
       static int num=0;
        static String name="ahmad";
    }


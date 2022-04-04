package ch5Switch;

public class LogicalOperator {
    public static void main(String[] args) {
        System.out.println("Logical Operator");
        System.out.println("\t\tOR \"||\"");
        System.out.printf("%s: %b%n%s: %b%n%s: %b%n%s: %b%n","false || false",(false || false),
                "false || true",(false || true),
                "true || false",true || false,
                "true || true",true || true);
        System.out.println("\t\tAND \"||\"");
        System.out.printf("%s: %b%n%s: %b%n%s: %b%n%s: %b%n","false && false",(false && false),
                "false && true",(false && true),
                "true && false",true && false,
                "true && true",true && true);
        System.out.println("\t\tBoolean Logical inclusive OR \"|\"");
        System.out.printf("%s: %b%n%s: %b%n%s: %b%n%s: %b%n","false || false",(false | false),
                "false | true",(false | true),
                "true | false",true | false,
                "true | true",true | true);
        System.out.println("\t\tBoolean Logical AND \"&\"");
        System.out.printf("%s: %b%n%s: %b%n%s: %b%n%s: %b%n","false && false",(false & false),
                "false & true",(false & true),
                "true & false",true & false,
                "true & true",true & true);
        System.out.println("\t\tBoolean Logical Exclusive \"^\"");
        System.out.printf("%s: %b%n%s: %b%n%s: %b%n%s: %b%n","false && false",(false ^ false),
                "false ^ true",(false ^ true),
                "true ^ false",true ^ false,
                "true ^ true",true ^ true);
        System.out.println("\t\tLogical Not \"!\"");
        System.out.printf("%s: %b%n%s: %b%n%n ","! false",(!false),
                "!true",(!true));


    }

}

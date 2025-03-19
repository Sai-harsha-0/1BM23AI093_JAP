import java.util.Scanner;
public class functions {

    public static boolean compareStrings(String str1, String str2) {
        return str1.equals(str2);
    }

    public static String copyString(String original) {
        return new String(original);
    }

    public static String concatenation(String str1, String str2) {
        return str1 + str2;
    }

    public static void main(String[] args) {
        String str1 = "My soldiers";
        String str2 = "Advance";
        System.out.println("result after comparing: " + compareStrings(str1, str2));
        System.out.println("copied string:"+ copyString(str1));
        System.out.println("concatenated string: " + concatenation(str1,str2));
    }
}
/*
result after comparing: false
copied string:My soldiers
concatenated string: My soldiersAdvance

 */
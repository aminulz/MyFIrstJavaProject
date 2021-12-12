import java.util.Locale;
import java.util.Scanner;
public class TypesofString {
    public static void main(String[] args) {
        String str = "Hello World";
        String str2 = new String("Hello World");
        boolean bool = str == str2; //Comparing objects, will return false
        boolean bool2 = str.equals(str2); //Comparing values, will return true
        System.out.println("Both string are same objects: "+bool);
        System.out.println("Both strings have same value: "+bool2);
    }
}

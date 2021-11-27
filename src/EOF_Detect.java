import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EOF_Detect {
    public static void main(String[] args) {

         List<String> names = new ArrayList<>();
         List<String> n1 = names;
        n1.add("Hi");
        n1.add("Hellow");

        names.forEach(System.out::println);

    }
}

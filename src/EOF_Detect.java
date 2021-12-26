import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EOF_Detect {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Hi");
        names.add("Hellow");
        List<String> n1 = names;


        n1.forEach(System.out::println);

    }
}

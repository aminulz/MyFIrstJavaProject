import java.util.*;
public class StringBuilderCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuilder str3 = new StringBuilder(input.nextLine());
        StringBuilder strx = CustomClass.stringCheck(str3);
        System.out.println(strx);
    }
}

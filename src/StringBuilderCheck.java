import java.util.*;
public class StringBuilderCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int value = input.nextInt();
        int x = CustomClass.evenOdd(value);
        if (x == 0) {
            System.out.println(value+ " is Even");
        }
        else{
            System.out.println(value+ " is Odd");
        }
    }
}

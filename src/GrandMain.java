import java.util.Scanner;
import StringManipulate.FirstPractice;

public class GrandMain {
    public static void main(String[] args) {
        FirstPractice reference = new FirstPractice();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = input.nextLine();
        System.out.println("Enter start index: ");
        int start = input.nextInt();
        System.out.println("Enter end index: ");
        int end = input.nextInt();
        FirstPractice.subString(str, start, end);

    }
}

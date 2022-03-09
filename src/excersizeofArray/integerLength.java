package excersizeofArray;
import java.util.Scanner;

public class integerLength {
    public static void main(String[] args) {
        while(true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter number: ");
            int number = scanner.nextInt();
            int length = 0;
            long temp = 1;
            if (number == 0){
                length++;
            }
            while (temp <= number) {
                length++;
                temp *= 10;
            }
            System.out.println(length);
        }
    }
}

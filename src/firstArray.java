import java.util.Arrays;
import java.util.Scanner;

public class firstArray {
    public static void main(String[] args) {
        int [] oldArray = {5, 15, 25, 35, 45, 55, 65, 75, 85, 95};
        for (int counter: oldArray) {
            System.out.println(counter);
        }
        int [] newArray = Arrays.copyOf(oldArray, 6);
        newArray[5] = 56;
        System.out.println("Modified array");
        for (int c2:oldArray) {
            System.out.println(c2);
        }
        System.out.println();
        for (int c3:newArray) {
            System.out.println(c3);
        }
    }
}

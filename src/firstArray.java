import java.util.Arrays;
import java.util.Scanner;

public class firstArray {
    public static void main(String[] args) {
        int [] oldArray = {5, 15, 25, 35, 45, 55, 65, 75, 85, 95};
        int [] newArray = Arrays.copyOf(oldArray, oldArray.length);
        newArray[5] = 556;
        System.out.println("Old array");
        for (int c2:oldArray) {
            System.out.print(c2 +" ");
        }
        System.out.println("\nNew Array");
        for (int c3:newArray) {
            System.out.print(c3 +" ");
        }
    }
}

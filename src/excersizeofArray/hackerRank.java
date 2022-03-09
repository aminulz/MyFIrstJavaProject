package excersizeofArray;
import java.util.*;

public class hackerRank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter breadth value : ");
        int b = scanner.nextInt();
        System.out.println("Enter height value : ");
        int h = scanner.nextInt();
//        int result = 1;
        if (b <= 0 || h <= 0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        else {
            int result = b * h;
            System.out.println("Result is : " +result);
        }
    }
}

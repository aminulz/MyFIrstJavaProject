import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Grade");
        String grade;
        while (!(grade = input.nextLine()).trim().equalsIgnoreCase("")){
            switch (grade) {
                case "A", "a", "B", "b", "C", "c", "D", "d" -> System.out.println("Passed");
                case "F", "f" -> System.out.println("Failed");
                default -> System.out.println("Invalid Input");
            }
        }
    }
}

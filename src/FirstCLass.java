import java.util.Scanner;

public class FirstCLass {
    public static void main(String[] args) {
        Scanner ScannedObject = new Scanner(System.in);
        System.out.println("Enter Kilometer Value");
        int num1 = ScannedObject.nextInt();

        double mile = num1 * 0.62137;
        double meter = num1 * 1000;

        System.out.println(num1+" Kilometer = " +mile +" Miles");
        System.out.println(num1+" Kilometer = " +meter +" Meters");

    }
}

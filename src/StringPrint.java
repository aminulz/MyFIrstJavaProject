import java.util.Scanner;

public class StringPrint {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        double num2 = scan.nextDouble();
        String str2 = scan.nextLine();
        String str = scan.nextLine();

        System.out.println("String: " + str);
        System.out.println("Double: " + num2);
        System.out.println("Int: " + num);
    }

}
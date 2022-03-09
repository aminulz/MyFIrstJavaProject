import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class StringPrint {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        int num = scan.nextInt();
//        double num2 = scan.nextDouble();
//        String str2 = scan.nextLine();
//        String str = scan.nextLine();
//
//        System.out.println("String: " + str);
//        System.out.println("Double: " + num2);
//        System.out.println("Int: " + num);
        System.out.println("Enter Number");
       int x =  sumOfInt(scan.nextLine());
        System.out.println(x);
    }
    public static int sumOfInt(String num){
        Scanner input = new Scanner(System.in);
//        System.out.println("Enter number: ");
//        String str1 = input.nextLine();
        char[] c = num.toCharArray();
        int sum = 0;
        for (int i = 0; i < c.length; i++) {
            if (Character.isDigit(c[i])) {
                int a = Integer.parseInt(String.valueOf(c[i]));
                sum = sum + a;
            }
        }
        return sum;
    }
    }

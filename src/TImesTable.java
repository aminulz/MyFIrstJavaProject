import java.util.Scanner;

public class TImesTable {
    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);
//        System.out.println("Enter a number");
//        int input = scn.nextInt();
//        for (int i=1; i<=10; i++){
//            int result = input * i;
//            System.out.println(input+ " * "+ i+ " = " +result );
//        }


//        System.out.println(str.length());
        float n = 2324435.3f;

        // here number is formatted from right margin and occupies a
        // width of 20 characters
        String str=" 2324435.25000";
        System.out.printf("Formatted to right margin: n = %8.5f\n length:%d", n,str.length());
    }
}

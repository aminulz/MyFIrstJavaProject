package allAboutArray;

import java.util.Scanner;

public class characterArray {
    public static void main(String[] args) {
        Character[] charArray = new Character[80];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter characters: ");
        for (int i = 0; i <= 80; i++) {
            charArray[i] = scan.next().charAt(0);
            if (Character.toLowerCase(charArray[i]) == 'y')
                charArray[i] = ' ';
            else if (Character.toLowerCase(charArray[i]) == 'x')
                break;
        }
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i]==null)
                break;
            else
                System.out.print(" " +charArray[i]);
        }
//        System.out.println(Arrays.toString(charArray));
    }
}

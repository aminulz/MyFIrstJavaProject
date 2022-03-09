package excersizeofArray;
import java.util.*;

public class stringLength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of input : ");
        int size = input.nextInt();
        String [] stringArray = new String[size];
        int evenCount = 0, oddCount = 0;
        for (int i = 0; i < size; i++) {
            String value = input.nextLine();
//            stringArray[i] = input.nextLine();
//            int sizeofStr = stringArray[i].length();
            int sizeofStr = 0;
            for(char c: value.toCharArray()) {
                sizeofStr++;
            }
            if (sizeofStr % 2 == 0  && sizeofStr > 0){evenCount++;}
            else if (sizeofStr % 2 != 0 && sizeofStr > 0){oddCount++;}
        }
        System.out.println("Even: "+evenCount);
        System.out.println("Odd: "+oddCount);
    }
}

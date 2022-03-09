import java.util.Scanner;

public class arrayProblems {
    public static void main(String[] args) {
//        Using Array
//        Scanner get = new Scanner(System.in);
//        System.out.println("Enter size of Array : ");
//        int arraySize = get.nextInt();
//        int[] practiceArray = new int[arraySize];
//        System.out.println("array size: " + practiceArray.length);
//        int evenCount = 0, oddCount = 0;
//        for (int i = 0; i < arraySize; i++) {
//            System.out.println("Enter array element : " );
//            practiceArray[i] = get.nextInt();
//            if(practiceArray[i] % 2 == 0 && practiceArray[i] > 0) evenCount++;
//            else if(practiceArray[i] % 2 != 0 && practiceArray[i] > 0) oddCount++;
//        }
//        System.out.println("Even : "+evenCount);
//        System.out.println("Even : "+oddCount);

//        Without array
        Scanner get = new Scanner(System.in);
        System.out.println("Enter number of input : ");
        int numOfInput = get.nextInt();
        int evenCount = 0, oddCount = 0;
        for (int i = 0; i < numOfInput; i++) {
            System.out.println("Enter element " +i+ " : " );
            int value = get.nextInt();
            if(value % 2 == 0 && value > 0) evenCount++;
            else if(value % 2 != 0 && value > 0) oddCount++;
        }
        System.out.println("Even element : "+evenCount);
        System.out.println("Odd element : "+oddCount);
    }
}

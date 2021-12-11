import java.util.Scanner;

public class firstArray {
    public static void main(String[] args) {
//        int [] myArray = {10, 12, 14, 16, 18, 20};
//        int [] newArray = myArray;
////        System.out.println(stringArr[1]+" "+myArray[2]);
//        for(int i=0; i<5; i++){
//            System.out.print(newArray[i]+" ");
//        }
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int arrLength = input.nextInt();
        int [] inputArray = new int[arrLength];
        for(int i=0; i < arrLength; i++) {
            System.out.println("Enter array elements: ");
            inputArray[i] = input.nextInt();
        }
        System.out.print("Here are values: ");
        for (int j=0; j<arrLength; j++){
            System.out.print(inputArray[j]+" ,");
        }
    }


}

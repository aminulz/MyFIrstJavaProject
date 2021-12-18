import java.util.Arrays;

public class ArrayManupulate {
    public static void main(String[] args) {
        int [] firstArray = {10, 20, 30, 40};
        int [] secondArray = new int[firstArray.length];
        for (int i = firstArray.length-1; i >= 0; i--) {
            secondArray[(firstArray.length - 1) - i]=firstArray[i];
        }
        System.out.println(Arrays.toString(secondArray));
    }
}

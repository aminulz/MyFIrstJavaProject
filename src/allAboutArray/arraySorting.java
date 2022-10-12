package allAboutArray;

import java.util.Arrays;

public class arraySorting {
    public static void main(String[] args) {
        int[] unsortedArray = {2, 3, 1, 5, 4};
        for (int i = 0; i < unsortedArray.length; i++) {
            for (int j = i+1; j < unsortedArray.length; j++) {
                if (unsortedArray[i] > unsortedArray[j]) {
                    int tmp = unsortedArray[i];
                    unsortedArray[i] = unsortedArray[j];
                    unsortedArray[j] = tmp;
                }
            }
        }
//        System.out.println("Unsorted array: " +Arrays.toString(sortingArray));
//        Arrays.sort(sortingArray);
//        System.out.println("Sorted array: " +Arrays.toString(sortingArray));
        System.out.println(Arrays.toString(unsortedArray));
    }
}

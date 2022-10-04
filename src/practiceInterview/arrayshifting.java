package practiceInterview;

import java.util.Arrays;
import java.util.Scanner;

public class arrayshifting {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter size");
        int size = scn.nextInt();
        int[] firstArray = new int[size];
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = scn.nextInt();
        }
        System.out.println("Initial Array: " + Arrays.toString(firstArray));

        System.out.println("Enter pop value");
        int pop = scn.nextInt();
        for (int i = 0; i < pop; i++) {
            int last = firstArray[firstArray.length-1];          // save off first element
            for( int index =firstArray.length-2; index >= 0 ; index-- )
                firstArray[index+1] = firstArray [index];  // shift right
            firstArray[0] = last;  // wrap last element into first slot
        }
        System.out.print("Shifted Array: " + Arrays.toString(firstArray) );
        }
    }


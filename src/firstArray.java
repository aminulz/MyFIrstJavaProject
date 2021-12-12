import java.util.Arrays;

public class firstArray {
    public static void main(String[] args) {
        int [] oldArray = {5, 15, 25, 35, 45, 55, 65, 75, 85, 95};
        int [] newArray = Arrays.copyOf(oldArray, oldArray.length); //Making a copy of old array
        newArray[5] = 556;
        System.out.println("Old array");
        for (int c2:oldArray) {
            System.out.print(c2 +" ");
        }
        System.out.println("\nNew Array");
        for (int c3:newArray) {
            System.out.print(c3 +" ");
        }

        System.out.println("\nSum of array 1 is: " + Arrays.stream(oldArray).sum()); //Sum of oldArray using Arrays.stream
    }
}


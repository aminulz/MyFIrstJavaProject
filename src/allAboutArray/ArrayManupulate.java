package allAboutArray;

public class ArrayManupulate {
    public static void main(String[] args) {
        int [] newArray = {3, 2, 1, 4, 5, 6, 7, 8, 9, 10};
        int sum, max, min;
        sum = 0;
        min = max = newArray[0];
        for (int i = 0; i < 10; i++) {
            sum+=newArray[i];
            if (newArray[i] > max)
                max = newArray[i];
            else if (newArray[i] < min)
                min=newArray[i];
        }
        System.out.println("Total: " +sum);
        sum=sum/10;
        System.out.println("Average: " +sum);
        System.out.println("Max: " +max);
        System.out.println("Min: " +min);
    }
}

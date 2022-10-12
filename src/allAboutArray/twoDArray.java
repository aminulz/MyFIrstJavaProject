package allAboutArray;

public class twoDArray {
    public static void main(String[] args) {
        int [][] twoDArray = {
                {11, 22, 33, 44, 10, 20, 30},
                {55, 66, 77, 88},
                {12, 23, 34, 45, 100},
                {56, 67, 78, 89}
        };
        int Result = 0;
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                System.out.print(twoDArray[i][j] +" ");
                Result = Result + twoDArray[i][j];
            }
            System.out.println();
        }
        System.out.println("\n\nSum of array: " +Result);
    }
}

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        for (int i = 1; i <= number; i++) {
            int resultThree = (i % 3) ;
            int resultFive  = (i % 5) ;
            if (resultThree == 0 && resultFive ==0 ){
                System.out.println("FizzBuzz");
            }
            else if (resultThree == 0 && resultFive !=0){
                System.out.println("Fizz");
            }
            else if (resultThree != 0 && resultFive ==0){
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }
        }
    }
}

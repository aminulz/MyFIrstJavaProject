import java.util.Scanner;
public class primeCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number");
        int prime = input.nextInt();
        boolean primeSw = false;


        for(int check = 2; check < prime; check++){
           int result = prime % check;
            if(result == 0){
                primeSw = true;
                break;
            }
        }

        if(primeSw == false){
            System.out.println("Prime");
        }
        else {
            System.out.println("Not prime");
        }
    }
}

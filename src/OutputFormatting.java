import java.util.Scanner;

public class OutputFormatting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=sc.next();
            String x=sc.nextLine();
            String [] words = x. split(" ");
            System.out.println(words[0]);
            System.out.println("            ");
            System.out.println(words[1]);
        }
        System.out.println("================================");

    }
}

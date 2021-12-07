

public class Loop {
    public static void main(String[] args) {
        int loop = 1;
        for (int x = 1; x < 5; x++){
            System.out.println("For print " +x);
        }
        while (loop < 5){
            System.out.println("While print " +loop);
            loop++;
        }
        do {
            System.out.println("Do While Print " +loop);
            loop--;
        } while (loop > 1);
    }
}

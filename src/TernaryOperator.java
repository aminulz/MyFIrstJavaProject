public class TernaryOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 8;
        int min;
//        if (a > b){
//            min = b;
//        }
//        else {
//            min = a;
//        }
        min = (a > b)? b :a;
        System.out.println(min);
    }
}

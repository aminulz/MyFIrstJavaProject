package StringManipulate;

public class FirstPractice {
    public static String subString(String text, int begin, int end){
        String sub = text;
        int start = begin, last = end;
        System.out.println("First 4 letters of the input is : " +sub.substring(0, 3) +" Last 4 letters of the input is : " +sub.substring(last-4, last));
        return sub;
    }
}

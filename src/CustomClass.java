public class CustomClass {
    public static StringBuilder stringCheck(StringBuilder a) {
        StringBuilder str1 = a;
        String x = String.valueOf(str1.append("\nAppended text"));
        String y = String.valueOf(str1.insert(6, "\nInserted text"));
        String z = String.valueOf(str1.replace(10, 11, "\nReplaced with 1"));
        StringBuilder result = new StringBuilder(x + y + z);
        return result;
    }

    public static int evenOdd(int value) {
        int result = value % 2;
        return result;
    }
}

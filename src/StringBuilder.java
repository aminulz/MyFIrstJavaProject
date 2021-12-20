public class StringBuilder {
    public static void main(String[] args) {
        StringBuffer builder = new StringBuffer("String builder example: ");
        System.out.println(builder);
        builder.append("Second part"); //Add word at the end of string
        System.out.println(builder);
        builder.insert(7, "insert "); //Insert string at defined position
        System.out.println(builder);
        builder.replace(7, 13, "Replaced"); //Replace specific word using index
        System.out.println(builder);
    }
}

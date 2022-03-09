public class ExceptionHandling {
    public static void main(String[] args) {
        int [] exceptionArray = {10, 15, 20, 25, 30, 35, 40, 45};
        System.out.println("Program Started");
        try {
            System.out.println(exceptionArray[24]);
        } catch (ArrayIndexOutOfBoundsException exception){
            System.out.println(exception);
        } finally {
            System.out.println("Constant Print");
        }
        System.out.println("Program Ended");
    }
}

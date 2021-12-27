import java.util.*;
public class ArrayListClass {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("Toyota");
        arrayList.add("Nissan");
        arrayList.add("Mitsubishi");
        arrayList.add("Mazda");
        for (String s: arrayList) {
            System.out.println(s);
        }
        arrayList.add(1, "Honda");
        System.out.println("");
        for (String s: arrayList) {
            System.out.println(s);
        }
        System.out.println(arrayList.contains("Toyota"));
        System.out.println("\n\n");
//        arrayList.clear();
        for (String s:arrayList
             ) {
            System.out.println(s);
        }
    }
}

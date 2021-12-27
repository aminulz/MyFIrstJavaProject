import java.util.*;
public class MapClass {
    public static void main(String[] args) {
        Map<String, String> firstMap = new HashMap<>();
        firstMap.put("First Car", "Toyota");
        firstMap.put("First Dog", "Husky");
        firstMap.put("Second Dog", "Pug");
        firstMap.put("Third Dog", "Shephard");
        firstMap.put("First Home", "Dhaka");
        firstMap.put("First Degree", "SSC");
        firstMap.put("Delete", "SSC");
        firstMap.put("First School", "Primary"); //This entry will be replaced by next entry
        firstMap.put("First School", "Secondary"); //Entry containing same keys will be replaced by last entry
        System.out.println(firstMap.get("First Dog"));

        System.out.println(firstMap.containsKey("First Car")); //Return if there is a key with specified word
        System.out.println(firstMap.containsValue("Toyota")); //Return if there is a value with specified word
        System.out.println(firstMap.size()); //Returns map size
//        firstMap.remove("Delete"); //Delete the value associated with specified key
//        firstMap.clear(); //Clear map

        firstMap.forEach((key, value) -> System.out.println(key + " : " + value));
    }
}

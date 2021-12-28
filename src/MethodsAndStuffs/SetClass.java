package MethodsAndStuffs;

import java.util.*;

public class SetClass {
    public static void main(String[] args) {
//        Hash Set

        Set<String> hashSet = new HashSet<>();
        hashSet.add("Grameenphone");
        hashSet.add("Airtel");
        hashSet.add("Teletalk");
        hashSet.add("Banglalink");
        hashSet.add("Banglalink");
        for (String S:hashSet) {
            System.out.println(S);
        }
        hashSet.isEmpty();
        System.out.println(hashSet.contains("Grameenphone"));

//        Tree Set

//        Set<String> treeSet = new TreeSet<>();
//        treeSet.add("Grameenphone");
//        treeSet.add("Airtel");
//        treeSet.add("Teletalk");
//        treeSet.add("Banglalink");
//        treeSet.add("Banglalink");
//        for (String S:treeSet) {
//            System.out.println(S);
//        }
//        System.out.println(hashSet.isEmpty());
//        System.out.println(treeSet.isEmpty());
    }
}

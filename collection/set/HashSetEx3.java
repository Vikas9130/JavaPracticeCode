package collection.set;

import java.util.HashSet;

public class HashSetEx3 {
    public static void main(String[] args) {
        HashSet<String> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();
        //adding to set1
        set1.add("banana");
        set1.add("grapes");
        set1.add("watermelon");
        //adding to set2
        set2.add("orange");
        set2.add("cherry");
        set2.add("banana");
        //declaring unionSet
        HashSet<String> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        System.out.println(set1);
        //System.out.println();
        System.out.println(set2);
        System.out.println(unionSet);        
    }
    
}

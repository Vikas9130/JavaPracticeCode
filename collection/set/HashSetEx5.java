package collection.set;

import java.util.HashSet;

public class HashSetEx5 {
    public static void main(String[] args) {
        // Create two HashSet objects
        HashSet<String> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();

        // Add elements to the first HashSet
        set1.add("Apple");
        set1.add("Banana");
        set1.add("Cherry");

        // Add elements to the second HashSet
        set2.add("Banana");
        set2.add("Orange");
        set2.add("Grapes");
        set2.add("Apple");
        // Find the difference between set1 and set2
        HashSet<String> difference = new HashSet<>(set1);
        difference.removeAll(set2);
        System.out.println(set1);
        System.out.println(set2);
        System.out.println(difference);
    }
    
}

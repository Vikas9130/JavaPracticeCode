package collection.set;
import java.util.HashSet;

public class HashSetEx4 {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();
        //adding to set1
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        //adding to set2
        set2.add(3);
        set2.add(4);
        set2.add(5);
        set2.add(6);
        
        //creating intersecSet
        HashSet<Integer> intersecSet = new HashSet<>(set1);
        //intersecSet.addAll(set2); //this is for union
        //intersection
        intersecSet.retainAll(set2);
        //printing
        System.out.println(set1);
        System.out.println(set2);
        System.out.println(intersecSet);
        

    }
    
}

package collection.set;
import java.util.HashSet;

public class HashSetEx6 {
    public static void main(String[] args) {
        //creating HashSet object
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(4);
        System.out.println(set);
        System.out.println(set.size());

        // declaring int array
        Integer[] arr = new Integer[set.size()];
        
        //coverting to array
        set.toArray(arr);
        int ib = arr[0];
        System.out.println(set);
        System.out.println("hell"+ib);
        for(int i: arr){
            System.out.println(i);
        }

        HashSet<Double> set1 = new HashSet<>();
        set1.add(1.1);
        Double[] dArr = new Double[set.size()];
        set1.toArray(dArr);
        System.out.println(dArr[0]);



        
        
    }
    
}

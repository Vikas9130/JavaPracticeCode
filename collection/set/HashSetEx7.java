package collection.set;

import java.util.HashSet;

public class HashSetEx7 {
    public static void main(String[] args) {
        //creating HashSet object
        HashSet<Integer> set = new HashSet<>();
        //creating int array
        int[] arr = new int[3];
        for(int i=0; i<3; i++){
            arr[i] = i;
        }
        for(int i:arr){
            set.add(i);
        }
        System.out.println(set);
    }
    
}

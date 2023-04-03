package secondarray;

import java.security.Key;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MajorElement {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,7,2};
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int count = 0;
        for(int i=0; i<nums.length; i++){   
                for(int j=i+1; j<nums.length; j++){
                    if(nums[i]==nums[j]){
                        ++count;
                    }
                }
            if(!map.containsKey(nums[i])){
                map.put(nums[i], count);
            }
            
            count = 0;
        }
        Map.Entry<Integer, Integer> maxEntry = null;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (maxEntry == null || entry.getValue() > maxEntry.getValue()) {
                maxEntry = entry;
            }
        }
        int k = maxEntry.getKey();
        System.out.println(k);
        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.println("Key = " + entry.getKey() +
                             ", Value = " + entry.getValue());
        } 
            
    }
    
}

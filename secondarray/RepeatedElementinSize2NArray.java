package secondarray;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RepeatedElementinSize2NArray {
    public static void main(String[] args) {
        int[] nums = {5,1,5,2,5,3,5,4};
        // int duplicate = 0;
        // for(int i=0; i<nums.length-1; i++){
        //     for(int j=i+1; j<nums.length; j++){
        //         if(nums[i]==nums[j]){
        //             duplicate = nums[i];
        //         }
        //         break;
        //     }
           
        // }
        //System.out.println(duplicate);
        Set<Integer> set = new HashSet<>();
        int j = 0;
        for(int i:nums){
            if(!set.contains(i)){
                set.add(i);
            }else{
                j=i;
            }  
        }        
        System.out.println(j);     
    }
    
}

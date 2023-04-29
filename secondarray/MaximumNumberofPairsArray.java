package secondarray;

import java.util.Arrays;

public class MaximumNumberofPairsArray {
    public static void main(String[] args) {
        int[] nums = {0};
        
        int count = 0;
        
        Arrays.sort(nums);//1,1,2,2,2,3,3
        for(int i=0; i<nums.length; i++){
           if(nums[i]==nums[i+1]){
            nums[i] = -1;
            nums[i+1] = -1;
            count++;
            i++;
           } 
        }
        System.out.println(count);
        for(int i:nums){
            if(i!=-1){
                System.out.println(i);
            }
            
        }
    }
    
}

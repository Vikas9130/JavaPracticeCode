package leetcode;

import java.util.TreeSet;

public class MaxAscendingSubarraySum {
    public static void main(String[] args) {
        int[] nums = {12,17,15,13,10,11,12};
        TreeSet<Integer> set = new TreeSet<>();
        
        for(int i=0; i<nums.length;i++){
            int sum = nums[i];
            for(int j=i+1; j<nums.length; j++){
                if(nums[j-1]<nums[j]){
                    sum = sum+nums[j];
                }else{
                    i = j-1;
                    break;
                }
                if(j==nums.length-1){
                    i=nums.length-1;
                }
            }
            set.add(sum);
        }
        System.out.println(set.last());

    }
    
}

package leetcode;

public class MaxAscendingSubarraySum1 {
    public static void main(String[] args) {
        int[] nums = {10,20,30,5,10,50};
        int res = Integer.MIN_VALUE;
        int sum = nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i-1]<nums[i]){
                sum=sum+nums[i];
            }else{
                if(sum>res){
                    res=sum;
                }
                sum=nums[i];
            }
            
        }
        res = Math.max(res, sum);
        System.out.println(res);
    
    }
    
}

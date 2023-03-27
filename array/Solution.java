
public class Solution {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        int[] o = twoSum(nums, target);
        for(int i=0; i<o.length; i++){
            System.out.print(o[i]+ " ");
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        int tar=0;
        int count = 0;
        int start = 0;
        for(int i =0; i<nums.length;i++){
            for(int j=i+1; j<nums.length;j++){
                tar = nums[i]+nums[j];
                if(target == tar){
                    start = i;
                    count = j;
                    break;
                }else{
                    start = 0;
                    count = 0;
                }
            }
            if(target == tar){
                break;
            }       
        }   
        int[] arr = new int[2];
        arr[0] = start;
        arr[1]  = count;
        return arr;
     }
}

package secondarray;

public class LeftandRightSumDifferences {
    public static void main(String[] args) {
        int[] nums = {1};
        int[] ans1 = new int[nums.length];
        int[] ans2 = new int[nums.length];
        int[] ans = new int[nums.length];
        int leftSum = 0;
        int rightSum = 0;
        for(int i=0; i<nums.length; i++){
            ans1[i] = leftSum;
            leftSum = leftSum + nums[i];
        }
        for(int i=nums.length-1; i>=0; i--){
            ans2[i] = rightSum;
            rightSum = rightSum + nums[i];
        }
        for(int i=0; i<nums.length; i++){
            int temp = ans1[i] - ans2[i];
            if(temp>=0){
                ans[i] = temp;
            }else{
                ans[i] = -temp;
            } 
        }
        for(int i: ans){
            System.out.print(i+" ");
        }
        ans1 = new int[1];
        ans2 = new int[1];

    }
    
}

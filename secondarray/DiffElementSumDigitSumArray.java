package secondarray;

public class DiffElementSumDigitSumArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int digitSum = 0;
        int elementSum = 0;
        for(int i=0; i<nums.length; i++){
            int temp = nums[i];
            int rem = 0;
            while(temp>0){
                rem = temp%10;
                digitSum+=rem;
                temp/=10;
            }
            elementSum+=nums[i];
        }
        System.out.println(elementSum-digitSum);
    }
    
}

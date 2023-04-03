
public class SumOfUniqueEle {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,2,5};
        int sum = 0;
        for(int i=0; i<nums.length; i++){
            int flag = 0;
            for(int j=0; j<nums.length; j++){
                if(i==j){
                    continue;
                }
                if(nums[i]==nums[j]){
                    flag = 1;
                }
            }
            if(flag==0){
                sum+=nums[i];
            }
        }
        System.out.println(sum);

        
    }
    
}

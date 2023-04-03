package secondarray;

public class SingleElement {

    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        int single = 0;
        for(int i=0; i<nums.length;i++){
            for(int j=i+1; j<nums.length;j++){
                if(nums[i]==nums[j]){
                    nums[i] = -1;
                    nums[j] = -1;
                } 
            }    
        }
        for(int i=0; i<nums.length;i++){
            if(nums[i]!=-1){
                single = nums[i];
            }
            System.out.print(nums[i]+" ");
        }

        System.out.println(single);

    }
    
}

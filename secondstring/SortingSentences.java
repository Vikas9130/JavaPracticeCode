package secondstring;

public class SortingSentences {

    public static void main(String[] args) {
        int[] nums = {2,14,18,22,22};
        boolean isDuplicate = false;
        for(int i=0; i<nums.length; i++){ 
            for(int j=i+1; j<nums.length;j++){
                    if(nums[i]==nums[j]){
                        isDuplicate = true;
                        break;
                    }
            }
            if(isDuplicate){
                break;
            }
                               
        } 
        System.out.println(isDuplicate);
    }
    
}

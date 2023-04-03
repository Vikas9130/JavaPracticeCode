package secondarray;

public class SmallerThanCurrentNumber {
    public static void main(String[] args) {
        int[] nums = {7,7,7,7};
        int size = nums.length;
        
        int[] temp = new int[size];
        for(int i=0; i<size; i++){
            int count = 0;
            for(int j=0; j<size; j++){
                if(i==j){
                    continue;
                }
                if(nums[i]>nums[j]){
                    count++;
                }
            }
            temp[i] = count;
        }
        for(int i:temp){
            System.out.print(i+" ");
        }
    }
    
}

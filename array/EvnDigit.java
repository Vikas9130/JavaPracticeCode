public class EvnDigit {
    public static void main(String[] args) {
        int[] nums = {123,563,785,963,569,145};
        int even = 0;

        for(int i=0; i<nums.length; i++){
            int count = 0;
            int temp = nums[i];
            while(temp>0){
                temp = temp/10;
                count++;
            }
            if(count%2==0){
                even++;
            }
        }
        System.out.println(even);
    }
    
}

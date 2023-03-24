package array;
public class ReturnSign {
    public static int arraySign(int[] nums) {
        int sign = 0;
        double product=0;
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>0){
                product = 1;
            }else if(nums[i]==0){
                product = 0;
                break;
            }else{
                count++;
            }
            
        }
        System.out.println(product);
        System.out.println(count);
        System.out.println(count%2);
        if(product>0){
            sign = 1;
        }else if(product==0){
            sign = 0;
        }
        if(count%2!=0){
            sign=-1;
        }
    return sign;
    }
    public static void main(String[] args) {
        int[] nums = {-1,1,-1,1,-1};
        System.out.println(arraySign(nums));
 
    }
}

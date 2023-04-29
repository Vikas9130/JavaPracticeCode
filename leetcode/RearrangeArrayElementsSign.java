package leetcode;

public class RearrangeArrayElementsSign {
    public static void main(String[] args) {
        int[] nums = {-1,1};
        int posIdx = 0;
        int negIdx = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]>=0){
                posIdx++;
            }else{
                negIdx++;
            }
        }
        int[] pos = new int[posIdx];
        int posIdx1 = 0;
        
        int[] neg = new int[negIdx];
        int negIdx1 = 0;
        
        int[] finalArr = new int[nums.length];

        for(int i=0; i<nums.length; i++){
            if(nums[i]>=0){
                pos[posIdx1] = nums[i];
                posIdx1++;
            }else{
                neg[negIdx1] = nums[i];
                negIdx1++;   
            }
        }
       
        int finalIdx = 0;

        int l1 = pos.length;
        int l2 = neg.length;
        int size = l1>=l2?l1:l2;

        for(int i=0; i<size; i++){
            finalArr[finalIdx] = pos[i];
            ++finalIdx;
            finalArr[finalIdx] = neg[i];
            ++finalIdx;
        }
        
        for(int i:finalArr){
            System.out.println(i);
        }

    }
    
}

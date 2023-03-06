package array;

public class RemoveDuplicatesfromSortedArray {

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 2, 3, 4, 4, 5};

        int addIndex = 1;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i]<nums[i+i]){
                nums[addIndex] = nums[i+i];
                addIndex++;
            }   
        }
        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i]+" ");
        }
    }
    
}

package array;

import java.util.Stack;

public class SeperateDigits {
    public static void main(String[] args) {
        int[] nums = {7,1,3,9};
        int[] arr = new int[nums.length*2];
        int index = 0;
        Stack stack = new Stack<>();
        for(int i=0; i<nums.length; i++){
            if(nums[i]>9){
                int temp = nums[i];
                while(temp>0){
                    stack.push(temp%10);
                    temp = temp/10;
                }
                while (!stack.isEmpty()) {
                    arr[index] = (int) stack.pop();
                    index++;
                }
            }else{
                arr = new int[nums.length];
                arr[i] = nums[i];
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}

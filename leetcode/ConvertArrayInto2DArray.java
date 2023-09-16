package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrayInto2DArray {
    public static void main(String[] args) {
        int[] nums = {1,3,4,1,2,3,1};
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            List<Integer> temp = new ArrayList<>();
            int ele = nums[i];

            for(int j=i+1; j<nums.length; j++){
                if(ele!=nums[j]){//1,1,1,2,3,3,4
                    list1.add(nums[i]);
                }else{
                    temp.add(nums[i]);
                }
            }
            for(int k:temp){
                System.out.println(k+" ...");
            }


        }
        for(int i:list1){
            System.out.print(i+" ");
        }
    }
    
}

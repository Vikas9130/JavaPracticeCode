package string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//
public class H {
    public static List<Integer> targetIndices(int[] arr, int target) {
        //int temp = 0;
        // for(int i=0; i<arr.length; i++){
        //     for(int j=0; j<arr.length; j++){
        //         if(arr[i]<arr[j]){
                    
        //           int temp=arr[i];
        //            arr[i]=arr[j];
        //            arr[j]=temp;
        //         }
        //     }    
        // }
        Arrays.sort(arr);
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(arr[i]==target){
                list.add(i);
            }
        }
       
        return list;
    }
    public static void main(String[] args) {
        int[] nums={1,2,5,2,3};
        int target=2;
        System.out.println(targetIndices(nums, target));
    }
    
}

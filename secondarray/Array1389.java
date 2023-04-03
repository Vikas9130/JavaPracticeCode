package secondarray;

import java.util.ArrayList;
import java.util.List;

public class Array1389 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int[] nums = {1,2,3,4,0};
        int[] index = {0,1,2,3,0};
        for(int i=0; i<index.length;i++){
            list.add(index[i],nums[i]);
        }
        int[] ans = new int[list.size()];
        for(int i: list){
            ans[i] = list.get(i);

        }
        System.out.println(list);
        
    }
    
}

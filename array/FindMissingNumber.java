package array;

import java.util.ArrayList;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] arr = {1,5,8,12,14};//output:  2 3 4 6 7 9 10 11 13 
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length-1;){
            int count = arr[i];
            int j=arr[i+1];
            while(count!=j){
                ++count;
                if(count!=j){
                    list.add(count);
                }
            }
            i++;
        }
        for(int i:list){
            System.out.print(i+" ");
        }
    }
    
}

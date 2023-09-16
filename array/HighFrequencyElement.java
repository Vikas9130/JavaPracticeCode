package array;

import java.util.HashMap;
import java.util.Map;

public class HighFrequencyElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,2,1,1,1};
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<arr.length;){
            int count = 1;
            int ele = arr[i];
            for(int j=i+1; j<arr.length; j++){
                if(ele==arr[j]){
                    count++;
                }
                
            }
            map.put(ele, count);
            break;
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            System.out.println("Element:"+entry.getKey()+" Count:"+entry.getValue());
        }
    }
    
}

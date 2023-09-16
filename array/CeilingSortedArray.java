package array;

import javax.sound.sampled.SourceDataLine;
import javax.xml.transform.SourceLocator;

public class CeilingSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,8,10,10,12,19};
        int x = 5;
    
        int floor = Integer.MIN_VALUE;
        int ceil = Integer.MAX_VALUE;
    
        for(int i=0; i<arr.length; i++){
            if(x<=arr[i]){
                floor = arr[i-1];
            }
        }
        System.out.println(floor);
        System.out.println(ceil);
        
    }
   
    
    
}

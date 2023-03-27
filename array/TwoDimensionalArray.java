package array;

import java.util.ArrayList;
import java.util.TreeSet;

import javax.sound.sampled.SourceDataLine;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int[][] accounts = {{1,5},{7,3},{3,5}};
        int sum = 0;
        TreeSet<Integer> list = new TreeSet();
        for(int i=0; i<accounts.length; i++){
            for(int j=0; j<accounts[i].length; j++){
                sum+=accounts[i][j];
                
            }
            list.add(sum);
            sum = 0;
        }
        System.out.println(list.last());
        // System.out.println(sum);  
        for(int i:list){
       
        }
    }

   
   
    
}

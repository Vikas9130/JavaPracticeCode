package secondarray;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithGreatNumberCandies {
    public static void main(String[] args) {
        int[] candies = {12,1,12};
        int extraCandies = 10;
        List<Boolean> list = new ArrayList<>();
        int max = candies[0];
        for(int i=1; i<candies.length; i++){
            if(max<candies[i]){
                max = candies[i];
            }   
        }
        System.out.println(max);
        for(int i=0; i<candies.length; i++){
            int add = candies[i]+extraCandies;
            if(add>=max){
                list.add(true);
            }else{
                list.add(false);
            }
        }
        for(boolean i:list){
            System.out.print(i+" ");
        }


    }
    
}

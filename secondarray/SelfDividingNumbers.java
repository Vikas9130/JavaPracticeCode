package secondarray;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumbers {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        int left = 47;
        int right = 85;
        for(int i=left; i<=right; i++){
            int temp = i;
            int isDivide = 0;
            int count=0;
            while(temp>0){
                int rem = temp%10;
                if(rem!=0){
                    if(i%rem==0){
                        isDivide++;   
                    }  
                } 
                temp/=10;
                count++;
            }
            if(isDivide==count&&i!=0){
                list.add(i);
            }   
        }
        System.out.println(list);

    }
    
}

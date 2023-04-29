package leetcode;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        int n = 3;
        List<String> list = new ArrayList<>();
        for(int i=1; i<=n; i++){
            //if i is divisible by 3 and 5
            if(i%3==0&&i%5==0){
                list.add("FizzBuzz");
            }else if(i%3==0){// if i is divisible by 3
                list.add("Fizz");
            }else if(i%5==0){//if i is divisible by 5.
                list.add("Buzz");
            }else{//if none of the above conditions are true.
                //String str = Integer.toString(i);
                list.add(String.valueOf(i));
            }
        }
        System.out.println(list);
        
    }
    
}

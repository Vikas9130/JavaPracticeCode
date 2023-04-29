package leetcode;

import java.util.HashMap;
import java.util.Map;

public class WordPattern {
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";

        HashMap<Character, String> map = new HashMap<>();
        HashMap<String, Boolean> used = new HashMap<>();


        String[] words = s.split(" ");
        boolean b = false;

        if(pattern.length()-1==words.length-1){
            for(int i=0; i<pattern.length(); i++){
               char ch = pattern.charAt(i);
               if(map.containsKey(ch)){
                    if(used.containsKey(words[i])==true){
                        b = false;
                    }else{
                        used.put(words[i],true);
                        map.put(ch, words[i]);
                    }
               }else{

               }
                
            }
        }else{
            System.out.println("this is false");
        }
        
        for (Map.Entry<Character, String> entry : map.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }

        

    }
    
}

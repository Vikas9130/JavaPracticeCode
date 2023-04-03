package string.string;
import java.security.KeyStore.Entry;
import java.util.*;

public class SameFrequency {

   
    public static void main(String[] args) {
        String s = "aaabb";
        int count = 0;
        int sum = 0;
        boolean isSame = false;
        HashMap<Character,Integer> map=new HashMap<Character,Integer>();//Creating HashMap
        for(int i=0; i<s.length(); i++){
            for(int j=0; j<s.length(); j++){
                if(i==j){
                    continue;
                }
                if(s.charAt(i)==s.charAt(j)){
                    count++;
                }
            }
            map.put(s.charAt(i),count);
                count = 0;
            }
            
            for (Map.Entry<Character,Integer> entry : map.entrySet()){
                System.out.println("Key = " + entry.getKey() +
                ", Value = " + entry.getValue());
            }
            Collection getValues = map.values();
            Iterator i = getValues.iterator();
            Object k;
            while (i.hasNext()) {
                k = i.next();

                System.out.println(i.next());
            }
            System.out.println(isSame);
            
               
                

            
            
            
            
            

        
    }
    
}

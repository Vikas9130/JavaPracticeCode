package secondstring;

import java.util.HashMap;
import java.util.Map;

public class DecodeMessage {
    public static void main(String[] args) {
        String key = "the quick brown fox jumps over the lazy dog";
        String message = "vkbs bs t suepuv";
        String abc = "abcdefghijklmnopqrstuvwxyz";
        Map<Character, Character> map = new HashMap<>();
        int index=0;
        for(char c:key.toCharArray()){
            if(c==' '||map.containsKey(c)){
                continue;
            }
            map.put(c,(char)('a'+index++));
        }
        StringBuilder sb = new StringBuilder();
        for(char c:message.toCharArray()){
            sb.append((c==' ')?' ':map.get(c));
        }
        System.out.println(sb.toString());
        


    }
    
}

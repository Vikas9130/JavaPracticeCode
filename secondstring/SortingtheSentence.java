package secondstring;

import java.util.Vector;

public class SortingtheSentence {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        String word = "";
        Vector<String> v = new Vector<>(10);
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)>=48&&s.charAt(i)<=57){
                word+=" ";
                int j = s.charAt(i)-48;
                v.add(j, word);
                word = "";
                i++;
                
            }else{
                word+=s.charAt(i);
            }
            
        }
        for(String str : v){
            System.out.println(str);
        }
    }
    
}

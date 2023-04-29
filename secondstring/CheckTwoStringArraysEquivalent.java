package secondstring;

import java.util.Arrays;

public class CheckTwoStringArraysEquivalent {
    public static void main(String[] args) {
        String[] word1 = {"abc","d","defg"};
        String[] word2 = {"abcddef"};
        String str1 = String.join("", word1);
        String str2 = String.join("", word2);
        // String str1 = Arrays.toString(word1);
        // String str2 = Arrays.toString(word2);
        // str1 = str1.replaceAll(" ", "");
        // str2 = str2.replaceAll(" ", "");
        // str1 = str1.replaceAll(",", "");
        // str2 = str2.replaceAll(",", "");
        boolean isEqual = String.join("", word1).equals(String.join("", word2));
        System.out.println(str1);
        System.out.println(str2);
        int size = 0;
        if(str1.length()>str2.length()){
            size = str1.length();
        }else{
            size = str2.length();
        }
        System.out.println("size"+size);
        // for(int i=0; i<size;i++){
        //     if(str1.charAt(i)==str2.charAt(i)){
        //         isEqual = true;
        //     }else{
        //         isEqual = false;
        //         break;
        //     }
        // }
        System.out.println(isEqual);
    }
    
}

package leetcode;

import java.util.Arrays;

public class SortingSentence {
    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        String[] arr = s.split(" ");
        String[] sortedString = new String[arr.length];
        for(String str:arr){
        int pos = str.charAt(str.length()-1)-48;
        System.out.println(pos); 
        sortedString[pos-1] = str.substring(0, str.length()-1);
        }
        String ori= String.join(" ", sortedString);
        System.out.println(ori);
    }
    
}

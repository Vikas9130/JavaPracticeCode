package assignment;
/*
 * Wap to calculate convert lower case string to upper case without using inbuild function
 * logic taken from google baba
 */
/*
 * solved on 04-01-2023
 * time complexity = O(2n)
 * 
 */

public class ConverLowerCaseToUpperCase2 {
    public static String toUpperCase(String str){
        char[] temp = str.toCharArray();
        String newStr = "";
        for(int i=0; i<str.length();i++){
            if(temp[i]>='a'&&temp[i]<='z'){
                temp[i] = (char) (temp[i]-32);
            }
        }
        for(int i=0; i<temp.length; i++){
            newStr = newStr + temp[i];
        }
        return newStr;
    }
    public static void main(String[] args) {
        String str = "This is my string.";
        String temp = toUpperCase(str);
        System.out.println(temp);
        
    }
}

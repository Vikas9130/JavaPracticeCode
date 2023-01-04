package assignment;
/*
 * Wap program to calculate length of string without using function
 */
/*
 * solved in 04-01-2023
 * time complexity = O(n)
 * space complexity = S(1);
 */

public class FindLengthOfString {
    public static int findLen(String str){
        int len = 0;   
        for(char c:str.toCharArray()){
           len++;
        }
        return len;
    }
   
    public static void main(String[] args) {
        String str = "Hello world";
        int len = findLen(str);
        System.out.println(len);        
    }
    
}

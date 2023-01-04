package assignment;
/*
 * Wap to reverse string without using inbuilt function
 */
/*
 * solved on 04-01-2023
 * time complexity = O(n)
 * space complexity = S(1)
 */
public class ReverseString {
    public static String reverse(String str){
        String temp = "";
        
            for(int j=str.length()-1; j>=0; j--){
                temp = temp + str.charAt(j);
            }
            return temp;
    }
    public static void main(String[] args) {
        String str = "vikas maruti pawar";
        String temp = reverse(str);
        System.out.println(temp);
    }
    
    
}

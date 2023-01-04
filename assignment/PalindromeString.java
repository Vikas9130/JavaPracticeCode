package assignment;
/*
 * 3. How to check if String is Palindrome?
Another easy coding question based upon String,
I am sure you must have done this numerous time.
Your program should return true if String is a Palindrome,
otherwise false. For example, if the input is "radar",
the output should be true, if the input is "madam" output will be true,
and if the input is "Java" output should be false.
 */
/*
 * solved on 04-01-2023
 * time complexity = O(n)
 * space complexity = S(1)
 */
public class PalindromeString {
    public static boolean isPalindrome(String str){
        boolean isPal = false;
        String temp = "";
        for(int i=str.length()-1; i>=0; i--){
            temp = temp + str.charAt(i);
        }
        if(temp.equalsIgnoreCase(str)){
            isPal = true;
        }
        return isPal;
    }
    public static void main(String[] args) {
        String str = "Radar";
        boolean isPal = isPalindrome(str);
        System.out.println(isPal);
    }
    
}

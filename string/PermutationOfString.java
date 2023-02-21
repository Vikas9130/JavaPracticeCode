package string;
/*
 * 1. How to find all permutations of String ?
Description:  I have seen this String interview question on many interviews.
It has an easy recursive solution but things get really tricky when Interviewer
asks you to solve this question without using recursion. You can use a Stack though.
Write a program to print all permutations of a String in Java, for example,
the if input is "xyz" then it should print "xyz", "yzx", "zxy", "xzy", "yxz", "zyx".
 */
import java.util.Stack;


//xyz
public class PermutationOfString {
    static Stack<Character> stack = new Stack<>();
    
    public static void findPermutation(String str){
        int len = str.length();
        int i = 0;
        while(i<=len){
            for(int j=0; j<str.length(); j++){
                pushStack(stack, str.charAt(j));
            
            } 
            System.out.println(stack); 
            i++;
        }
         
    }

    public static void pushStack(Stack stack, char ch){
        stack.push(new Character(ch));
    }

    public static void main(String[] args) {
        String str = "xyz";
        findPermutation(str);
    }
    
}

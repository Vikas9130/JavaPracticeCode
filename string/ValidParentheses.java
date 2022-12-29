package string;
/*
20. Valid Parentheses
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', 
determine if the input string is valid.
An input string is valid if:
Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.
 */
/*
 * not solved on 29-12-2022
 * some test cases have not been passed.
 */
public class ValidParentheses {
    public static boolean isValid(String str){
       // char[] temp = str.toCharArray();
       boolean isTrue = false;
       //int count = (str.length()-1)/2;
        for(int i=0; i<str.length()-1; i++){
            //for(int j=0; j<str.length(); j++){
                if(str.charAt(i)=='('&&str.charAt(i+1)==')'){
                    isTrue = true;
                }else if(str.charAt(i)=='{'&&str.charAt(i+1)=='}') {
                    isTrue = true;
                }else if(str.charAt(i)=='['&&str.charAt(i+1)==']'){
                    isTrue = true;
                }else{
                    isTrue = false;
                }
               // count++;
            }
                
           // }
            return isTrue;
        }
        public static void main(String[] args) {
            String str = "{}";
            boolean is = isValid(str);
            System.out.println(is);
        }
    
    
}

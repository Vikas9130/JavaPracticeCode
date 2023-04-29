package leetcode;

public class ValidPalindromeII {
    public static void main(String[] args) {
        String s = "abccba";
        String palin = "";
       
        int start = 0;
        int end = s.length()-1;
        boolean b = false;
        while(start>=end){
            if(s.charAt(start)==s.charAt(end)){
                b= true;
                start++;
                end--;
            }
        }
        System.out.println(b);
       
        if(b){
            System.out.println("String is palindrome");
        }else{
            System.out.println("String is not palindrome");
        }
    }
    
}

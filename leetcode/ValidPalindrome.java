package leetcode;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        s=s.toLowerCase();
        System.out.println(s);


        String sb = "";
        for(char ch:s.toCharArray()){
            if(Character.isDigit(ch)||Character.isLetter(ch)){ 
                sb+=ch;
            }
        }
        String plain = "";
        for(int i=sb.length()-1; i>=0; i--){
            plain+=sb.charAt(i);
        }
        if(plain.equals(sb)){
            System.out.println("is palindrom");
        }
        System.out.println(plain);
 

    }
    
}

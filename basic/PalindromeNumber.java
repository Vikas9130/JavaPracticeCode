package basic;

public class PalindromeNumber {
    public static void main(String[] args) {
        int number = 1221;
        int rev = 0;
        int duplicate = number;
        int rem = 0;
        while (number>0) {
            rem = number%10;
            rev = rev*10+rem;
            number/=10;
        }
        if(rev==duplicate){
            System.out.println("given number is palindrome.");
        }else{
            System.out.println("given number is not palindrome.");
        }
        
    }
    
}

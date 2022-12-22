package basic;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 212;
        int temp = num;
        int swap = 0;
        int no=0;
        while(num > 0){
             no = num%10;
            swap=(swap*10)+no;
            num =num/10;
        }
        System.out.println(swap);
        if(temp==swap)
            System.out.println("number is palindrome.");
        else
            System.out.println("number is not palindrome");
    
}
}

package basic;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 456654;
        int temp = num;
        int swap = 0;
        while(num > 0){
            num = num%10;

            swap=num;
        }
        
        System.out.println(swap);
    
}
}

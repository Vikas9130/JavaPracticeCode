package basic;

public class ProdSumOfDigits {
    public static void main(String[] args) {
        int num = 234;
        int prod = 1;
        int sum = 0;
        int temp = num;
        int rem;
        while(temp>0){
            rem = temp%10;
            prod = prod*rem;
            sum = sum+rem;
            temp = temp/10;
        }
        
        System.out.println(prod-sum);
    }
    
}

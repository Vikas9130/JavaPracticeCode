package leetcode;

public class AddDigits {
    public static void main(String[] args) {
        int num = 199;
        int sum = 0;

        while(num>9){
            while(num>0){
                int rem = num%10;
                sum+=rem;
                num/=10;
            }
            num = sum;
            sum=0;
        }
        System.out.println(num);
        

    }
    
}

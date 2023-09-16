package basic;

public class Arm {
    public static void main(String[] args) {
        int num = 153;
        int temp = num;
        int orginal = num;
        int digits = 0;
        while(num>0){
            num/=10;
            digits++;
        }

        System.out.println(digits);
        int arm = 0;
        for(int i=1; i<=digits; i++){
            int rem = temp%10;
            arm = arm+(int)Math.pow(rem, digits);
            temp/=10;
        }
        System.out.println(arm==orginal);
    }
    
}

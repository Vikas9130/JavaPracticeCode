package basic;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int number = 1634;//153
        int originalNum = number;
        int temp = number;
        int rem = 0;
        int sum = 0;
        int count = 0;
        while(number>0){
            number/=10;
            count++;
        }
        while(temp>0){
            rem = temp%10;
            sum = sum+(int)Math.pow(rem, count);
            temp = temp/10;
        }
        if(sum==originalNum){
            System.out.println("given number is armstrong.");
        }else{
            System.out.println("given number is not armstrong.");
        }
        


    }
    
}

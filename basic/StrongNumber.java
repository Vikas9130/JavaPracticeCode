package basic;

public class StrongNumber {
    public static void main(String[] args) {
        int number = 145;
        int sum = 0;
        int originalNum = number;
        while(number>0){
            int rem = number%10;
            int fact = 1;
            for(int i=1; i<=rem; i++){
                fact =fact*i;
            }
            sum = sum+fact;
            number/=10;
        }
        if(sum==originalNum){
            System.out.println("given number is Strong number.");
        }else{
            System.out.println("given number is not strong number");
        }

    }
    
}

package basic;

public class PrimeNumber {
    public static void main(String[] args) {
        int number = 7;
        boolean isPrime = false;
        for(int i=2; i<number; i++){
            if(number%i==0){
                isPrime = true;
                break;
            }
        }
        if(isPrime){
            System.out.println("given number is not prime.");
        }else{
            System.out.println("given number is prime.");
        }
    }
    
}

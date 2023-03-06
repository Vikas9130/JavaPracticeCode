package basic;
/*
 * A number that divided exactly only by itself and on.
 */
public class PrimeNumber {
    public static void primeNumber(int num){
        int temp = 0;
            for(int i=2; i<num; i++){
                if(num%i == 0){                 
                    temp++;
                }
            }
            if(temp>0){
                System.out.println("not prime");
            }else{
                System.out.println("prime");
            }

    }
    public static void main(String[] args) {
        int num = 6;
        primeNumber(num);
    }
    
}

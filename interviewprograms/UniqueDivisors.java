package interviewprograms;

public class UniqueDivisors {
    public static int uniqueDivisors(int num){
        int count = 0;
        if(num>0){
            for(int i=1; i<=num; i++){
                if(num%i==0){
                    count++;
                }
            }

        }else{
            System.out.println("Number is less than zero, can not find divisors.");
        }
        return count;
    }
    public static void main(String[] args) {
        int divisor = uniqueDivisors(100);
        System.out.println(divisor);
        
    }
    
}

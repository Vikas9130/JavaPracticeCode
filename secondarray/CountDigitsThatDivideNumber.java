package secondarray;

public class CountDigitsThatDivideNumber {
    public static void main(String[] args) {
        int num = 1248;
        int temp = num;
        int count = 0;
        while(temp>0){
            int rem = temp%10;
            if(num%rem==0){
                count++;
            }
            temp/=10;
        }
        System.out.println(count);
        
    }
    
}

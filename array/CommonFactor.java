package array;

public class CommonFactor {
    public static void main(String[] args) {
        int a = 12;
        int b = 6;
        int count = 0;
        int min = Math.min(a, b);
        for(int i=1; i<=min;i++){
            if(a%i==0 && b%i==0){
                count++;
            }
        }
        System.out.println(count);
    }
    
}

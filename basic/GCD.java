package basic;

public class GCD {
    public static void main(String[] args) {
        int a = 12;
        int b = 8;
        int gcd = 0;
        int max = Math.max(a, b);
        for(int i=1; i<=max; i++){
            if(a%i==0 && b%i==0){
                gcd = i;
            }
        }
        System.out.println(gcd);
    }
    
}

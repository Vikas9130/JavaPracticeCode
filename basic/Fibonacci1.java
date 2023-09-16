package basic;

public class Fibonacci1 {
    public static void main(String[] args) {
        int num = 20;
        int a = 0;
        int b = 1;
        for(int i=0; i<num; i++){
            System.out.print(a+" ");
            int sum = a+b;
            a=b;
            b=sum;
        }
    }
    
}

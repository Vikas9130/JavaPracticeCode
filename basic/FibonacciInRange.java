package basic;

/**
 * FibonacciInRange
 */
public class FibonacciInRange {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int num1 = 0;
        int num2 = 1;
        int sum = 0;
        arr[0]=num1;
        arr[1]=num2;
        for(int i=2; i<10; i++){
            sum = num1+num2;
            num1=num2;
            num2=sum;
            arr[i]=sum;
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
    
    }
    
}
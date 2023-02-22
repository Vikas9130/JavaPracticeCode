package basic;

public class SwapTwoNumberWithThirdVar {
    public static void swapTwoNumberWithThirdVar(int a, int b){
        System.out.println("Before swapping a : "+a);
        System.out.println("Before swapping b : "+b);
        int temp = a;
        a=b;
        b=temp;
        System.out.println("After swapping a : "+a);
        System.out.println("After swapping b : "+b);

    }
    public static void main(String[] args) {
        int a =10, b=20;
        swapTwoNumberWithThirdVar(a, b);
        
    }
}

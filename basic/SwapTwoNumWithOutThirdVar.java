package basic;

public class SwapTwoNumWithOutThirdVar {
    public static void swapTwoNumberWithThirdVar(int a, int b){
        System.out.println("Before swapping a : "+a);
        System.out.println("Before swapping b : "+b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After swapping a : "+a);
        System.out.println("After swapping b : "+b);
    }
    public static void main(String[] args) {
        int a=-10, b=20;
        swapTwoNumberWithThirdVar(a, b);
    }
    
}
